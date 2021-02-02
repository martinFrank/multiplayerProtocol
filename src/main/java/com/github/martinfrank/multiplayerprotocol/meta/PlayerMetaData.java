package com.github.martinfrank.multiplayerprotocol.meta;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PlayerMetaData {

    @JsonProperty
    private String userId;

    @JsonProperty
    private String userName;

    @JsonProperty
    private String playerAreaId;


    public PlayerMetaData(){
        // Jackson deserialization
    }

    public PlayerMetaData(String userId, String userName, String playerAreaId) {
        this.userId = userId;
        this.userName = userName;
        this.playerAreaId = playerAreaId;
    }

    public String getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public String getPlayerAreaId() {
        return playerAreaId;
    }

    @Override
    public String toString() {
        return "PlayerMetaData{" +
                "userId='" + userId + '\'' +
                ", userName='" + userName + '\'' +
                ", playerArea='" + playerAreaId + '\'' +
                '}';
    }
}
