package com.github.martinfrank.multiplayerprotocol.area;

public enum Direction {

    NW(-1, -1), N(0, -1), NE(1, -1),
    W(-1, 0), C(0, 0), E(1, 0),
    SW(-1, 1), S(0, 1), SE(1, 1);

    final int dx;
    final int dy;

    Direction(int dx, int dy) {
        this.dx = dx;
        this.dy = dy;
    }


}
