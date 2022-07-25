package ua.ithillel.java;

import ua.ithillel.java.Gadgets.DialPhone;
import ua.ithillel.java.Gadgets.Mobile;
import ua.ithillel.java.Gadgets.SmartPhone;
import ua.ithillel.java.Interface.MailSender;
import ua.ithillel.java.Service.ContactsPhone;
import ua.ithillel.java.Service.Post;
import ua.ithillel.java.Service.Programs;
import ua.ithillel.java.Technique.Crockpot;
import ua.ithillel.java.Technique.Oven;

public class Main {
    public static void main(String[] args) {

        System.out.println("\n");

        ContactsPhone[] book = new ContactsPhone[3];
        book[0] = new ContactsPhone("PizzaDelivery", 5175379);
        book[1] = new ContactsPhone("EMS", 911);
        book[2] = new ContactsPhone("Bob", 5178427);

        Mobile mobile = new Mobile();
        mobile.call(book[2]);
        mobile.powerOff();

        System.out.println("\n");

        DialPhone dialPhone = new DialPhone();
        dialPhone.hasAnswerPhone = true;
        dialPhone.autoAnswer();
        dialPhone.powerOff();

        SmartPhone smartPhone = new SmartPhone("IOS");
        smartPhone.runApp();

        Programs[] programs = new Programs[2];
        programs[0] = new Programs("Dairy", 25);
        programs[1] = new Programs("Roast", 60);

        System.out.println("\n");

        Crockpot crockpot = new Crockpot();
        crockpot.switchProgram(programs[0]);
        crockpot.cook();

        System.out.println("\n");

        Oven oven = new Oven();
        oven.initTimer(25);
        oven.cook();
        oven.powerOff();

        System.out.println("\n");

        Post post = new Post();
        post.createMail("Put your message.");
        post.sendMail("Send your message.");

        System.out.println("\n");

        SmartPhone xiaomi = new SmartPhone("Android");
        xiaomi.call();
        xiaomi.editMail("Change message.");

        System.out.println("\n");

        DialPhone samsung = new DialPhone();
        samsung.call();

        AbstractDevice[] devices = {xiaomi, oven, smartPhone, crockpot, dialPhone, smartPhone};
        System.out.println("\n");
        powerOff(devices);

        System.out.println("\n");
        MailSender[] senders = {(SmartPhone) devices[0], new Post()};
        sendMail(senders);
    }

    private static void sendMail(MailSender[] senders) {
        for (MailSender sender : senders) {
            sender.sendMail("Sending sms by method.");
        }
    }

    private static void powerOff(AbstractDevice[] devices) {
        for (AbstractDevice device : devices) {
            device.powerOff();
        }
    }
}

