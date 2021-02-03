package com.github.martinfrank.multiplayerprotocol.meta;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AreaServerCredentials {

    @JsonProperty
    public String areaId;

    @JsonProperty
    public String user;

    @JsonProperty
    public String pass;

    @JsonProperty
    public String playerId;

    public AreaServerCredentials(){
        // Jackson deserialization
    }

    public AreaServerCredentials(String areaId, String user, String pass, String playerId) {
        this.areaId = areaId;
        this.user = user;
        this.pass = pass;
        this.playerId = playerId;
    }

    public AreaServerCredentials(AreaServerCredentials areaServerCredentials, String playerId) {
        this.areaId = areaServerCredentials.areaId;
        this.user = areaServerCredentials.user;
        this.pass = areaServerCredentials.pass;
        this.playerId = playerId;
    }

    @Override
    public String toString() {
        return "AreaServerCredentials{" +
                "areaId='" + areaId + '\'' +
                ", user='" + user + '\'' +
                ", pass='" + pass + '\'' +
                ", playerId='" + playerId + '\'' +
                '}';
    }
}
