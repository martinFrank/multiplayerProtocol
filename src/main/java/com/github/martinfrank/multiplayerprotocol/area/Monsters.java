package com.github.martinfrank.multiplayerprotocol.area;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

public class Monsters {

    @JsonProperty
    public List<Monster> monsters = new ArrayList<>();

    public Monsters(){
        // Jackson deserialization
    }

//    public void add(Monster monster) {
//        if(monsters == null){
//            monsters = new ArrayList<>();
//        }
//        monsters.add(monster);
//    }

    public List<Monster> getAll() {
        return monsters;
    }
}
