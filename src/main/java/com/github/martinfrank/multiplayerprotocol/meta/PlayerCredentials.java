package com.github.martinfrank.multiplayerprotocol.meta;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PlayerCredentials {

    @JsonProperty
    private String name;

    @JsonProperty
    private String pass;

    public PlayerCredentials(){
        // Jackson deserialization
    }

    public PlayerCredentials(String name, String pass) {
        this.name = name;
        this.pass = pass;
    }

    public String getName() {
        return name;
    }

    public String getPass() {
        return pass;
    }

    @Override
    public String toString() {
        return "Logon{" +
                "name='" + name + '\'' +
                ", pass='" + pass + '\'' +
                '}';
    }
}
