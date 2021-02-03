package com.github.martinfrank.multiplayerprotocol.area;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

public class MapChanges {


    @JsonProperty
    public List<MonsterMovement> monsterMovements = new ArrayList<>();

    @JsonProperty
    public List<PlayerMovement> playerMovements = new ArrayList<>();

    public MapChanges() {
        // Jackson deserialization
    }

    public boolean hasChanges() {
        return !monsterMovements.isEmpty() || !playerMovements.isEmpty();
    }

    @Override
    public String toString() {
        return "MapChanges{" +
                "monsterMovements=" + monsterMovements +
                ", playerMovements=" + playerMovements +
                '}';
    }

    public void clear() {
        monsterMovements.clear();
        playerMovements.clear();
    }
}
