package com.github.martinfrank.multiplayerprotocol.area;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MonsterMovement {

    @JsonProperty
    public String id;

    @JsonProperty
    public Position from;

    @JsonProperty
    public Position to;

    public MonsterMovement() {
        // Jackson deserialization
    }

    //FIXME uuid for subject
    public MonsterMovement(String id, Position from, Position to) {
        this.id = id;
        this.from = from;
        this.to = to;
    }

    @Override
    public String toString() {
        return "MonsterMovement{" +
                "entityId=" + id +
                ", from=" + from +
                ", to=" + to +
                '}';
    }
}
