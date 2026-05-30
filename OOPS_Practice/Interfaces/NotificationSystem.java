interface Notifications {
    void sendMessages(String message);
}
class MobileNotification implements Notifications{
    public void sendMessages(String message) {
        System.out.println("Sending Mobile notification: " + message);
    }

}
class EmailNotification implements Notifications{
    public void sendMessages(String message) {
        System.out.println("Sending Email notification: " + message);
    }

}
class JobNotification implements Notifications{
    public void sendMessages(String message) {
        System.out.println("Sending Job notification: " + message);
    }

}

class InstaNotification implements Notifications {

    public void sendMessages(String message) {
        System.out.println("Sending Insta notification: " + message);
    }
}

class WhatsappNotification implements Notifications {

    public void sendMessages(String message) {
        System.out.println("Sending Whatsapp notification: " + message);
    }
}

public class NotificationSystem {

    public static void main(String[] args) {
        MobileNotification mn=new MobileNotification();
        EmailNotification en=new EmailNotification();
        JobNotification jn=new JobNotification();
        InstaNotification in = new InstaNotification();
        WhatsappNotification wn = new WhatsappNotification();

        mn.sendMessages("You have a new notification of mobile!");
        en.sendMessages("You have a new email notification!");
        jn.sendMessages("You have a new job queries!");
        in.sendMessages("You have a new message!");
        wn.sendMessages("You have a new message!");
    }
}