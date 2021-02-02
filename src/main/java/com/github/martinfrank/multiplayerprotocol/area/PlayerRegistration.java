package com.github.martinfrank.multiplayerprotocol.area;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.UUID;

public class PlayerRegistration {

    @JsonProperty
    public String playerId;

    public PlayerRegistration() {
        // Jackson deserialization
    }

    public PlayerRegistration(String playerId) {
        this.playerId = playerId;
    }


}
