package com.github.martinfrank.multiplayerprotocol.area;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BaseMessageParser implements MessageParser {

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
            if (contentClass.equals(Monster.class)) {
                Monster monster = (Monster) content;
                handleMonster(monster);
                return;
            }
            if (contentClass.equals(Player.class)) {
                Player player = (Player) content;
                handlePlayer(player);
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
            if (contentClass.equals(AreaTotal.class)) {
                AreaTotal areaTotal = (AreaTotal) content;
                handleAreaTotal(areaTotal);
                return;
            }
            LOGGER.warn("no parser for {} ", contentClass);
        } catch (ClassNotFoundException | JsonProcessingException e) {
            e.printStackTrace();
        }
    }

    public void handleAreaTotal(AreaTotal areaTotal) {
    }

    public void handlePlayerMovementRequest(PlayerMovementRequest playerMovementRequest) {
    }

    public void handlePlayerRegistration(PlayerRegistration playerRegistration) {

    }

    public void handleMapChanges(MapChanges mapChanges) {

    }

    //wurde durch AreaTotal ersetzt
    @Deprecated
    public void handleMonsters(Monsters monsters){

    }

    public void handleMonster(Monster monster){

    }

    public void handlePlayer(Player player){

    }


}
