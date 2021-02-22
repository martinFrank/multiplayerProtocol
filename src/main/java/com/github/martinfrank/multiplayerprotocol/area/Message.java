package com.github.martinfrank.multiplayerprotocol.area;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Message<T> {

    @JsonProperty
    public String className;

    @JsonProperty
    public String jsonContent;

    @JsonIgnore
    public T context;

    public Message(){
        // Jackson deserialization
    }

    public Message(String className, String jsonContent){
        this.className = className;
        this.jsonContent = jsonContent;
    }

    @Override
    public String toString() {
        return "Message{" +
                "className='" + className + '\'' +
                ", jsonContent='" + jsonContent + '\'' +
                '}';
    }

    public T getContext() {
        return context;
    }
}
