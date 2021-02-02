package com.github.martinfrank.multiplayerprotocol.area;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

public class MapChanges {


    @JsonProperty
    public List<MonsterMovement> monsterMovements = new ArrayList<>();

    public MapChanges() {
        // Jackson deserialization
    }


//    //FIXME - this method should not belong to a model class - it should be in the areaserverclass
//    public String createBroadCastMessage() {
//        return "mapChanges: "+ Calendar.getInstance().get(Calendar.SECOND);
//    }

//    public void add(MonsterMovement monsterMovement) {
//        monsterMovements.add(monsterMovement);
//    }

    public boolean hasChanges() {
        return !monsterMovements.isEmpty();
    }

    @Override
    public String toString() {
        return "MapChanges{" +
                "monsterMovements=" + monsterMovements +
                '}';
    }
}
