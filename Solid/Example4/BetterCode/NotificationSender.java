package Solid.Example4.BetterCode;

import java.util.List;

public class NotificationSender {

    public void sendNotification(List<String> notificationTypes, String message) {

        for (String notificationType : notificationTypes) {
            switch (notificationType) {
                case "SMS":
                    // Code to send SMS notification
                    SMSNotification smsNotification = new SMSNotification();
                    smsNotification.sendNotification(message);
                    break;
                case "EMAIL":
                    // Code to send Email notification
                    EmailNotification emailNotification = new EmailNotification();
                    emailNotification.sendNotification(message);
                    break;
                case "PUSH_NOTIFICATION":
                    // Code to send Push notification
                    PushNotification pushNotification = new PushNotification();
                    pushNotification.sendNotification(message);
                    break;
                default:
                    throw new IllegalArgumentException("Unsupported notification type: " + notificationType);
            }
        }
    }
}
