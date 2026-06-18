package Solid.Example4.ImproveCode;

import java.util.List;

public class NotificationSender {

    public void sendNotification(List<Notification> notificationTypes, String message) {

        for (Notification notification : notificationTypes) {
            // Send notification using the common interface method
            notification.sendNotification(message);
        }
    }
}
