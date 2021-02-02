package com.github.martinfrank.multiplayerprotocol.area;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.UUID;

public class MonsterMovement {

    @JsonProperty
    public String entityId;

    @JsonProperty
    public Position from;

    @JsonProperty
    public Position to;

    public MonsterMovement() {
        // Jackson deserialization
    }

    //FIXME uuid for subject
    public MonsterMovement(String entityId, Position from, Position to) {
        this.entityId = entityId;
        this.from = from;
        this.to = to;
    }

    @Override
    public String toString() {
        return "MonsterMovement{" +
                "entityId=" + entityId +
                ", from=" + from +
                ", to=" + to +
                '}';
    }
}
