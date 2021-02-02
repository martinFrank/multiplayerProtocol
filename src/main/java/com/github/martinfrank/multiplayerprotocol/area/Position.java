package com.github.martinfrank.multiplayerprotocol.area;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Position {

    @JsonProperty
    public int x;

    @JsonProperty
    public int y;

    public Position() {
        this(0,0);
    }

    public Position(int x, int y) {
        this.x = x;
        this.y = y;

    }
    public Position(Position position) {
        this(position.x, position.y);
    }

    @Override
    public String toString() {
        return "Postion{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public void move(Direction dir) {
        x = x + dir.dx;
        y = y + dir.dy;
    }
}
