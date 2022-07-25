package ua.ithillel.java.Gadgets;

import ua.ithillel.java.Interface.Caller;

public class DialPhone extends Mobile implements Caller {

    public boolean hasAnswerPhone;

    @Override
    public void powerOn() {
        System.out.println("Phone is on! Start using.");
    }

    @Override
    public void powerOff() {
        System.out.println("Phone is off! Finish using.");
    }

    public void autoAnswer() {
        if (hasAnswerPhone) {
            System.out.println("Autoresponder enabled, leave your message.");
        } else System.out.println("Please call back later.");
    }

    @Override
    public void call() {
        System.out.println("Calling..");
    }
}
