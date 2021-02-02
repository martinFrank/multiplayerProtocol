package com.github.martinfrank.multiplayerprotocol.area;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.UUID;

public class Monster {

    @JsonProperty
    public String monsterTypeId;

    @JsonProperty
    public String entityId;

    @JsonProperty
    public Position position;

    public Monster (){
        // Jackson deserialization
    }

    public Monster (String entityId, String monsterTypeId, Position position){
        this.entityId = entityId;
        this.monsterTypeId = monsterTypeId;
        this.position = position;
    }

    @Override
    public String toString() {
        return "Monster{" +
                "monsterTypeId=" + monsterTypeId +
                ", entitiyId=" + entityId +
                ", position=" + position +
                '}';
    }

    public void move(Direction dir) {
        position.move(dir);
    }
}
