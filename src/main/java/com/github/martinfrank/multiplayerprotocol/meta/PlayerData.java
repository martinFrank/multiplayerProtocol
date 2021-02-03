package com.github.martinfrank.multiplayerprotocol.meta;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.martinfrank.multiplayerprotocol.area.Position;

public class PlayerData {

    @JsonProperty
    public Position position;

    @JsonProperty
    public String id;

    public PlayerData(){
        // Jackson deserialization
    }

    @Override
    public String toString() {
        return "PlayerData{" +
                "position=" + position +
                ", id='" + id + '\'' +
                '}';
    }
}
