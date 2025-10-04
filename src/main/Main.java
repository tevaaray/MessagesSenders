package main;

import main.message.Message;
import main.message.PushMessage;
import main.message.TextMessage;
import main.sender.EmailSender;
import main.sender.PushSender;
import main.sender.SMSSender;

/**
 * Client class demonstrating the Bridge Pattern.
 * Shows how abstractions (Message types) and implementors (Senders)
 * can vary independently and be combined at runtime.
 */
public class Main {
    public static void main(String[] args) {
        // 1️⃣ Create and send a TextMessage via Email
        System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
        System.out.println("📤 Sending a Text Message via Email");
        Message textViaEmail = new TextMessage(new EmailSender());
        textViaEmail.send("Hello from Bridge Pattern via Email!");
        System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━\n");

        // 2️⃣ Create and send a TextMessage via SMS
        System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
        System.out.println("📤 Sending a Text Message via SMS");
        Message textViaSMS = new TextMessage(new SMSSender());
        textViaSMS.send("This is a text message sent via SMS.");
        System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━\n");

        // 3️⃣ Create and send a PushMessage via Push
        System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
        System.out.println("📤 Sending a Push Message via Push Notification");
        Message pushViaPush = new PushMessage(new PushSender());
        pushViaPush.send("Push notification sent successfully!");
        System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━\n");

        // 4️⃣ Create and send a PushMessage via Email
        System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
        System.out.println("📤 Sending a Push Message via Email");
        Message pushViaEmail = new PushMessage(new EmailSender());
        pushViaEmail.send("Push message delivered by Email!");
        System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━\n");
    }
}