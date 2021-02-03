package com.github.martinfrank.multiplayerprotocol.area;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.martinfrank.multiplayerprotocol.meta.PlayerData;

public class Player {

    @JsonProperty
    public String id;

    @JsonProperty
    public Position position;

    public Player (){
        // Jackson deserialization
    }

    public Player(String id, Position position) {
        this.id = id;
        this.position = position;
    }

    public Player(PlayerData playerData) {
        this(playerData.id, playerData.position);

    }

    @Override
    public String toString() {
        return "Player{" +
                "id='" + id + '\'' +
                ", position=" + position +
                '}';
    }

    public void move(Direction dir) {
        position.move(dir);
    }
}
