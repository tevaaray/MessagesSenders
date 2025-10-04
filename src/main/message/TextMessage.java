package main.message;

import main.sender.Sender;

/**
 * Refined Abstraction 1: TextMessage
 * Sends a simple text message using a chosen sender.
 */
public class TextMessage extends Message {

    public TextMessage(Sender sender) {
        super(sender);
    }

    @Override
    public void send(String content) {
        System.out.println("[TextMessage] Preparing to send...");
        sender.send(content);
    }
}