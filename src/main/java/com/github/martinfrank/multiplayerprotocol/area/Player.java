package com.github.martinfrank.multiplayerprotocol.area;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.martinfrank.multiplayerprotocol.meta.PlayerData;

public class Player {

    @JsonProperty
    public String id;

    @JsonProperty
    public Position position;

    @JsonProperty
    public boolean isEntering;

    public Player() {
        // Jackson deserialization
    }

    public Player(String id, Position position, boolean isEntering) {
        this.id = id;
        this.position = position;
        this.isEntering = isEntering;
    }

    public Player(PlayerData playerData, boolean isEntering) {
        this(playerData.id, playerData.position, isEntering);

    }

    public boolean isEntering() {
        return isEntering;
    }

    public boolean isLeaving() {
        return !isEntering;
    }

    @Override
    public String toString() {
        return "Player{" +
                "id='" + id + '\'' +
                ", position=" + position +
                ", isEntering=" + isEntering +
                '}';
    }

    public void move(Direction dir) {
        position.move(dir);
    }
}
