package com.github.martinfrank.multiplayerprotocol.area;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PlayerMovement {

    @JsonProperty
    public String id;

    @JsonProperty
    public Position from;

    @JsonProperty
    public Position to;

    public PlayerMovement() {
        // Jackson deserialization
    }

    //FIXME uuid for subject
    public PlayerMovement(String id, Position from, Position to) {
        this.id = id;
        this.from = from;
        this.to = to;
    }

    @Override
    public String toString() {
        return "PlayerMovement{" +
                "id=" + id +
                ", from=" + from +
                ", to=" + to +
                '}';
    }
}
