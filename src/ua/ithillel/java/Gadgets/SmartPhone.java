package ua.ithillel.java.Gadgets;

import ua.ithillel.java.Interface.Caller;
import ua.ithillel.java.Interface.EmailSender;

import java.util.Date;

public class SmartPhone extends Mobile implements Caller, EmailSender {

    private String os;

    public SmartPhone(String os) {
        this.os = os;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public void runApp() {
        Date currentDate = new Date();
        System.out.println("Open application time " + currentDate);
    }
    @Override
    public void call() {
        System.out.println("Calling..");
    }

    @Override
    public String createMail(String mail) {
        System.out.println("Put message..");
        return mail;
    }

    @Override
    public void sendMail(String mail) {
        System.out.println("Send message..");
    }
    @Override
    public String editMail(String mail) {
        mail = "Message editing.";
        System.out.println(mail);
        return mail;
    }
}
