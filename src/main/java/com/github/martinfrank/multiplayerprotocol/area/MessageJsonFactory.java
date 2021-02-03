package com.github.martinfrank.multiplayerprotocol.area;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MessageJsonFactory {

    private static final Logger LOGGER = LoggerFactory.getLogger(MessageJsonFactory.class);

    public static String create(MapChanges mapChanges) {
        try {
            ObjectMapper mapper = new ObjectMapper();
            Message message = new Message(MapChanges.class.getName(), mapper.writeValueAsString(mapChanges));
            return mapper.writeValueAsString(message);
        }catch (JsonProcessingException e){
            LOGGER.error("error creating Json for MapChanges {}: {}", mapChanges, e);
        }
        return "";
    }

    public static String create(AreaTotal areaTotal) {
        try {
            ObjectMapper mapper = new ObjectMapper();
            Message message = new Message(AreaTotal.class.getName(), mapper.writeValueAsString(areaTotal));
            return mapper.writeValueAsString(message);
        }catch (JsonProcessingException e){
            LOGGER.error("error creating Json for AreaTotal {}: {}", areaTotal, e);
        }
        return "";
    }

    public static String create(Player player) {
        try {
            ObjectMapper mapper = new ObjectMapper();
            Message message = new Message(Player.class.getName(), mapper.writeValueAsString(player));
            return mapper.writeValueAsString(message);
        }catch (JsonProcessingException e){
            LOGGER.error("error creating Json for Player {}: {}", player, e);
        }
        return "";
    }
}
