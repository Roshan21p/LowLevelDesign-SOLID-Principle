package Solid.Example4.ImproveCode;

public class SMSNotification implements Notification {
    
    @Override
    public void sendNotification(String message) {
        // Code to send SMS notification
        System.out.println("Sending SMS notification: " + message);
    }
}
