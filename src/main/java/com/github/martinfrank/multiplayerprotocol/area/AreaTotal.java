package com.github.martinfrank.multiplayerprotocol.area;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AreaTotal {

    @JsonProperty
    public Monsters monsters;

    @JsonProperty
    public Players players;


    public AreaTotal() {
        // Jackson deserialization
    }

    public AreaTotal(Monsters monsters, Players players) {
        this.monsters = monsters;
        this.players = players;
    }

    @Override
    public String toString() {
        return "AreaTotal{" +
                "monsters=" + monsters +
                ", players=" + players +
                '}';
    }

}
