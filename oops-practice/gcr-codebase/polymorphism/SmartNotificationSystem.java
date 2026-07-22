import java.util.Scanner;


class Notification {
    String recipientName;
    String message;

    Notification(String recipientName, String message) {
        this.recipientName = recipientName;
        this.message = message;
    }

    void sendNotification() {
        System.out.println("Sending Notification...");
    }
}


class EmailNotification extends Notification {

    EmailNotification(String recipientName, String message) {
        super(recipientName, message);
    }

    @Override
    void sendNotification() {
        System.out.println("Email sent to " + recipientName);
        System.out.println("Message: " + message);
        
    }
}


class SMSNotification extends Notification {

    SMSNotification(String recipientName, String message) {
        super(recipientName, message);
    }

    @Override
    void sendNotification() {
        System.out.println("SMS sent to " + recipientName);
        System.out.println("Message: " + message);
       
    }
}


class PushNotification extends Notification {

    PushNotification(String recipientName, String message) {
        super(recipientName, message);
    }

    @Override
    void sendNotification() {
        System.out.println("Push Notification sent to " + recipientName);
        System.out.println("Message: " + message);
        
    }
}


public class SmartNotificationSystem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Notification[] notifications = new Notification[3];

        System.out.print("Enter Email recipient name: ");
        String emailName = sc.nextLine();

        System.out.print("Enter SMS recipient name: ");
        String smsName = sc.nextLine();

        System.out.print("Enter Push recipient name: ");
        String pushName = sc.nextLine();

        notifications[0] = new EmailNotification(emailName, "Welcome to our service!");
        notifications[1] = new SMSNotification(smsName, "Your OTP is 123456.");
        notifications[2] = new PushNotification(pushName, "You have a new update!");

        System.out.println("\n----- Sending Notifications -----");

        
        for (Notification n : notifications) {
            n.sendNotification();
        }

        sc.close();
    }
}
