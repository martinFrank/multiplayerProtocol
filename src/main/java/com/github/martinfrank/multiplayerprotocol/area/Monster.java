package com.github.martinfrank.multiplayerprotocol.area;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Monster {

    @JsonProperty
    public String typeId;

    @JsonProperty
    public String id;

    @JsonProperty
    public Position position;

    public Monster (){
        // Jackson deserialization
    }

    public Monster (String id, String typeId, Position position){
        this.id = id;
        this.typeId = typeId;
        this.position = position;
    }

    @Override
    public String toString() {
        return "Monster{" +
                "monsterTypeId=" + typeId +
                ", entitiyId=" + id +
                ", position=" + position +
                '}';
    }

    public void move(Direction dir) {
        position.move(dir);
    }
}
