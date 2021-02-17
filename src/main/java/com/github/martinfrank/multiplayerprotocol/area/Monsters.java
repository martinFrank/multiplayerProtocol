package com.github.martinfrank.multiplayerprotocol.area;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

public class Monsters {

    @JsonProperty
    public List<Monster> monsters = new ArrayList<>();

    public Monsters() {
        // Jackson deserialization
    }


    public List<Monster> getAll() {
        return monsters;
    }

    @Override
    public String toString() {
        return "Monsters{" +
                "monsters=" + monsters +
                '}';
    }
}
