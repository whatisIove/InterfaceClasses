package ua.ithillel.java.Service;

import ua.ithillel.java.Interface.MailSender;

public class Post implements MailSender {
    @Override
    public String createMail(String mail) {
        System.out.println("Put your message.");
        return mail;
    }

    @Override
    public void sendMail(String mail) {
        System.out.println("Send your message.");
    }
}
