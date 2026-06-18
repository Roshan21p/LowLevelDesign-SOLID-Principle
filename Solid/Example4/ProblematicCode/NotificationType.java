package Solid.Example4.ProblematicCode;

public enum NotificationType {

    SMS,
    EMAIL,
    PUSH_NOTIFICATION,
    WhatsApp;

    public void sendSMSNotification(String message) {
        // Code to send SMS notification
        System.out.println("Sending SMS notification: " + message);
    }

    public void sendEmailNotification(String message) {
        // Code to send Email notification
        System.out.println("Sending Email notification: " + message);
    }

    public void sendPushNotification(String message) {
        // Code to send Push notification
        System.out.println("Sending Push notification: " + message);
    }
}
