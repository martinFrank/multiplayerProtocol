package com.github.martinfrank.multiplayerprotocol.area;

import java.nio.channels.SelectionKey;

public interface MessageParser<T> {

    void parse(Message<T> message);

}
