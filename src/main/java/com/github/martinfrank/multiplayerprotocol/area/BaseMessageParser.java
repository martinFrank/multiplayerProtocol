package com.github.martinfrank.multiplayerprotocol.area;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BaseMessageParser<T> implements MessageParser<T> {

    private static final Logger LOGGER = LoggerFactory.getLogger(BaseMessageParser.class);

    @Override
    public void parse(Message<T> message) {
        try {
            ObjectMapper mapper = new ObjectMapper();
            Class<?> contentClass = Class.forName(message.className);
            Object content = mapper.readValue(message.jsonContent, contentClass);

            if (contentClass.equals(Monsters.class)) {
                Monsters monsters = (Monsters) content;
                handleMonsters(monsters, message.getContext());
                return;
            }
            if (contentClass.equals(Monster.class)) {
                Monster monster = (Monster) content;
                handleMonster(monster, message.getContext());
                return;
            }
            if (contentClass.equals(Player.class)) {
                Player player = (Player) content;
                handlePlayer(player, message.getContext());
                return;
            }
            if (contentClass.equals(MapChanges.class)) {
                MapChanges mapChanges = (MapChanges) content;
                handleMapChanges(mapChanges, message.getContext());
                return;
            }
            if (contentClass.equals(PlayerRegistration.class)) {
                PlayerRegistration playerRegistration = (PlayerRegistration) content;
                handlePlayerRegistration(playerRegistration, message.getContext());
                return;
            }
            if (contentClass.equals(PlayerMovementRequest.class)) {
                PlayerMovementRequest playerMovementRequest = (PlayerMovementRequest) content;
                handlePlayerMovementRequest(playerMovementRequest, message.getContext());
                return;
            }
            if (contentClass.equals(AreaTotal.class)) {
                AreaTotal areaTotal = (AreaTotal) content;
                handleAreaTotal(areaTotal, message.getContext());
                return;
            }
            LOGGER.warn("no parser for {} ", contentClass);
        } catch (ClassNotFoundException | JsonProcessingException e) {
            e.printStackTrace();
        }
    }

    public void handleAreaTotal(AreaTotal areaTotal, T t) {
    }

    public void handlePlayerMovementRequest(PlayerMovementRequest playerMovementRequest, T t) {
    }

    public void handlePlayerRegistration(PlayerRegistration playerRegistration, T t) {

    }

    public void handleMapChanges(MapChanges mapChanges, T t) {

    }

    public void handleMonsters(Monsters monsters, T t){

    }

    public void handleMonster(Monster monster, T t){

    }

    public void handlePlayer(Player player, T t){

    }


}
