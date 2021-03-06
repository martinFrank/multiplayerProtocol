package com.github.martinfrank.multiplayerprotocol.area;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

public class Players {

    @JsonProperty
    public List<Player> players = new ArrayList<>();

    public Players() {
        // Jackson deserialization
    }

    public Player getPlayer(String playerId) {
        return players.stream().filter(p -> p.id.equals(playerId)).findAny().orElse(null);
    }

    @Override
    public String toString() {
        return "Players{" +
                "players=" + players +
                '}';
    }
}
