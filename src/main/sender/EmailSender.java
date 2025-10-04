package main.sender;

/**
 * Concrete Implementor 1: EmailSender
 * Implements the send method for email delivery.
 */
public class EmailSender implements Sender {
    @Override
    public void send(String content) {
        System.out.println("📧 Sending Email: " + content);
    }
}
