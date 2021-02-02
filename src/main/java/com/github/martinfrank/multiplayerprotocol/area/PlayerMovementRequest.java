package com.github.martinfrank.multiplayerprotocol.area;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.UUID;

public class PlayerMovementRequest {

    @JsonProperty
    public String playerId;

    @JsonProperty
    public Direction direction;

    public PlayerMovementRequest() {
        // Jackson deserialization
    }

    public PlayerMovementRequest(String playerId, Direction direction) {
        this.playerId = playerId;
        this.direction = direction;
    }

    @Override
    public String toString() {
        return "PlayerMovementRequest{" +
                "direction=" + direction +
                '}';
    }
}
