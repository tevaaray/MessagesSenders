package main.sender;

/**
 * Implementor interface in Bridge Pattern.
 * Defines the method for sending messages.
 */
public interface Sender {
    void send(String content);
}