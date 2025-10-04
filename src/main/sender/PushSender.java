package main.sender;

/**
 * Concrete Implementor 3: PushSender
 * Implements the send method for push notifications.
 */
public class PushSender implements Sender {
    @Override
    public void send(String content) {
        System.out.println("🔔 Sending Push Notification: " + content);
    }
}