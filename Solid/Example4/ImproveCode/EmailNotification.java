package Solid.Example4.ImproveCode;

public class EmailNotification implements Notification {

    @Override
    public void sendNotification(String message) {
        // Code to send Email notification
        System.out.println("Sending Email notification: " + message);
    }
}
