package com.github.martinfrank.multiplayerprotocol.meta;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PlayerLogon {

    @JsonProperty
    public String playerId;

    @JsonProperty
    public boolean enter;

    @JsonProperty
    public boolean leave;

    @JsonProperty
    public AreaServerCredentials areaServerCredentials;

    public PlayerLogon(){
        // Jackson deserialization
    }
}
