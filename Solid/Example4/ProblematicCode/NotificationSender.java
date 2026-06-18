package Solid.Example4.ProblematicCode;

public class NotificationSender {

    public void sendNotification(NotificationType notificationType, String message) {
        switch (notificationType) {
            case SMS:
                notificationType.sendSMSNotification(message);
                break;
            case EMAIL:
                notificationType.sendEmailNotification(message);
                break;
            case PUSH_NOTIFICATION:
                notificationType.sendPushNotification(message);
                break;
            default:
                throw new IllegalArgumentException("Unsupported notification type");

        }
    }
}
