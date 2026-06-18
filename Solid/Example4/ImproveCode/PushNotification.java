package Solid.Example4.ImproveCode;

public class PushNotification implements Notification {
    
    @Override
    public void sendNotification(String message) {
        // Code to send Push notification
        System.out.println("Sending Push notification: " + message);
    }
}
