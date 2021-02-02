package com.github.martinfrank.multiplayerprotocol.area;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BaseMessageParser implements MessageParser{

    private static final Logger LOGGER = LoggerFactory.getLogger(BaseMessageParser.class);

    @Override
    public void parse(Message message) {
        try {
            ObjectMapper mapper = new ObjectMapper();
            Class<?> contentClass = Class.forName(message.className);
            Object content = mapper.readValue(message.jsonContent, contentClass);
            if (contentClass.equals(Monsters.class)) {
                Monsters monsters = (Monsters) content;
                handleMonsters(monsters);
                return;
            }
            if (contentClass.equals(MapChanges.class)) {
                MapChanges mapChanges = (MapChanges) content;
                handleMapChanges(mapChanges);
                return;
            }
            if (contentClass.equals(PlayerRegistration.class)) {
                PlayerRegistration playerRegistration = (PlayerRegistration) content;
                handlePlayerRegistration(playerRegistration);
                return;
            }
            if (contentClass.equals(PlayerMovementRequest.class)) {
                PlayerMovementRequest playerMovementRequest = (PlayerMovementRequest) content;
                handlePlayerMovementRequest(playerMovementRequest);
                return;
            }
            LOGGER.warn("no parser for {} ", contentClass);
        } catch (ClassNotFoundException | JsonProcessingException e) {
            e.printStackTrace();
        }
    }

    protected void handlePlayerMovementRequest(PlayerMovementRequest playerMovementRequest) {
    }

    protected void handlePlayerRegistration(PlayerRegistration playerRegistration) {

    }

    public void handleMapChanges(MapChanges mapChanges) {

    }

    public void handleMonsters(Monsters monsters){

    }

}
