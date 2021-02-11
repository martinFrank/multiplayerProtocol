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
    public boolean isEntering;

    public Monster() {
        // Jackson deserialization
    }

    public Monster(String id, String typeId, Position position, boolean isEntering) {
        this.id = id;
        this.typeId = typeId;
        this.position = position;
        this.isEntering = isEntering;
    }

    public boolean isEntering() {
        return isEntering;
    }

    public boolean isLeaving() {
        return !isEntering;
    }

    @Override
    public String toString() {
        return "Monster{" +
                "typeId='" + typeId + '\'' +
                ", id='" + id + '\'' +
                ", position=" + position +
                ", isEntering=" + isEntering +
                '}';
    }

    public void move(Direction dir) {
        position.move(dir);
    }
}
