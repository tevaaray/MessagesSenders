package main.message;

import main.sender.Sender;

/**
 * Refined Abstraction 2: PushMessage
 * Sends a push message using a chosen sender.
 */
public class PushMessage extends Message {

    public PushMessage(Sender sender) {
        super(sender);
    }

    @Override
    public void send(String content) {
        System.out.println("[PushMessage] Preparing to send...");
        sender.send(content);
    }
}
