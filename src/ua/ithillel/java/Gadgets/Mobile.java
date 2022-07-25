package ua.ithillel.java.Gadgets;

import ua.ithillel.java.Service.ContactsPhone;

public class Mobile extends Phone {

    private int simCount;
    private ContactsPhone book;
    private boolean displayIsActive;

    @Override
    public void powerOn() {
        System.out.println("Phone is on, hello my owner!");
        displayIsActive = true;
    }

    @Override
    public void call(ContactsPhone book) {
        if (displayIsActive) {
            System.out.println("You can call!");
        }
        simCount = 1;
        if (simCount == 2) {
            System.out.println("Choose sim for call.");

        } else System.out.println("Calling.. " + book.getName() + " for number " + book.getNumber());
    }

    @Override
    public void powerOff() {
        System.out.println("Phone is off, bye my owner!");
        displayIsActive = false;
    }

}
