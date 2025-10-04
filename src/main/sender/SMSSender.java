package main.sender;

/**
 * Concrete Implementor 2: SMSSender
 * Implements the send method for SMS delivery.
 */
public class SMSSender implements Sender {
    @Override
    public void send(String content) {
        System.out.println("📱 Sending SMS: " + content);
    }
}