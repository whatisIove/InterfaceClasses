package ua.ithillel.java.Technique;

import ua.ithillel.java.Service.Programs;

public class Crockpot extends Multicooker {

    private Programs programs;
    boolean isPoweredByPower;

    @Override
    protected void powerOn() {
        isPoweredByPower = true;
        System.out.println("Crockpot is on. Select a cooking program.");
    }

    public void switchProgram(Programs programs) {
        if (isPoweredByPower) {
            System.out.println("You choose " + programs.getName() + " time to cooking "
                    + programs.getTime() + " right?");
        } else System.out.println("Error, you must choose.");
    }

    @Override
    public void cook() {
        System.out.println("Your meal is being cooked.");
    }

    @Override
    protected void powerOff() {
        isPoweredByPower = false;
        System.out.println("Crockpot is off.");
    }

}


