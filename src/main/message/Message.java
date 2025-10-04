package main.message;

import main.sender.Sender;

/**
 * Abstraction in Bridge Pattern.
 * Holds a reference to a Sender (Implementor).
 * Delegates sending operation to the implementor.
 */
public abstract class Message {
    protected Sender sender;

    protected Message(Sender sender) {
        this.sender = sender;
    }

    /**
     * Abstract send method to be implemented by refined abstractions.
     * @param content - the content of the message
     */
    public abstract void send(String content);
}