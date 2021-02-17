package com.github.martinfrank.multiplayerprotocol.area;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Monster {

    @JsonProperty
    public String typeId;

    @JsonProperty
    public String id;

    @JsonProperty
    public Position position;

    @JsonProperty
    public boolean enters;

    public Monster() {
        // Jackson deserialization
    }

    public Monster(String id, String typeId, Position position, boolean enters) {
        this.id = id;
        this.typeId = typeId;
        this.position = position;
        this.enters = enters;
    }

    public boolean enters() {
        return enters;
    }

    public boolean leaves() {
        return !enters;
    }

    @Override
    public String toString() {
        return "Monster{" +
                "typeId='" + typeId + '\'' +
                ", id='" + id + '\'' +
                ", position=" + position +
                ", enters=" + enters +
                '}';
    }

    public void move(Direction dir) {
        position.move(dir);
    }
}
