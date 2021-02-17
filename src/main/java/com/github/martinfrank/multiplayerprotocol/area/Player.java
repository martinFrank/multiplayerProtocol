package com.github.martinfrank.multiplayerprotocol.area;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.martinfrank.multiplayerprotocol.meta.PlayerData;

public class Player {

    @JsonProperty
    public String id;

    @JsonProperty
    public Position position;

    @JsonProperty
    public boolean enters;

    public Player() {
        // Jackson deserialization
    }

    public Player(String id, Position position, boolean enters) {
        this.id = id;
        this.position = position;
        this.enters = enters;
    }

    public Player(PlayerData playerData, boolean enters) {
        this(playerData.id, playerData.position, enters);

    }

    public boolean enters() {
        return enters;
    }

    public boolean leaves() {
        return !enters;
    }

    @Override
    public String toString() {
        return "Player{" +
                "id='" + id + '\'' +
                ", position=" + position +
                ", isEntering=" + enters +
                '}';
    }

    public void move(Direction dir) {
        position.move(dir);
    }
}
