package com.github.martinfrank.multiplayerprotocol.area;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Player {

    @JsonProperty
    public String playerId;

    @JsonProperty
    public Position position;

    public Player (){
        // Jackson deserialization
    }

    public Player(String playerId, Position position) {
        this.playerId = playerId;
        this.position = position;
    }

    @Override
    public String toString() {
        return "Player{" +
                "playerId='" + playerId + '\'' +
                ", position=" + position +
                '}';
    }
}
