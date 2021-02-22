package com.github.martinfrank.multiplayerprotocol.meta;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PlayerMetaData {

    @JsonProperty
    public String userId;

    @JsonProperty
    public String userName;

    @JsonProperty
    public String playerAreaId;

    @JsonProperty
    public boolean online;


    public PlayerMetaData(){
        // Jackson deserialization
    }

    public PlayerMetaData(String userId, String userName, String playerAreaId, boolean online) {
        this.userId = userId;
        this.userName = userName;
        this.playerAreaId = playerAreaId;
        this.online = online;
    }

    @Override
    public String toString() {
        return "PlayerMetaData{" +
                "userId='" + userId + '\'' +
                ", userName='" + userName + '\'' +
                ", playerAreaId='" + playerAreaId + '\'' +
                ", online=" + online +
                '}';
    }
}
