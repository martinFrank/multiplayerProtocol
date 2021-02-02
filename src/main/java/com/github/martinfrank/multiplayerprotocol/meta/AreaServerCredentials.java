package com.github.martinfrank.multiplayerprotocol.meta;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AreaServerCredentials {

    @JsonProperty
    private String areaId;

    @JsonProperty
    private String user;

    @JsonProperty
    private String pass;

    public AreaServerCredentials(){
        // Jackson deserialization
    }

    public AreaServerCredentials(String areaId, String user, String pass) {
        this.areaId = areaId;
        this.user = user;
        this.pass = pass;
    }

    public String getAreaId() {
        return areaId;
    }

    public String getPass() {
        return pass;
    }

    public String getUser() {
        return user;
    }

    @Override
    public String toString() {
        return "AreaServerCredentials{" +
                "areaId='" + areaId + '\'' +
                ", user='" + user + '\'' +
                ", pass='" + pass + '\'' +
                '}';
    }
}
