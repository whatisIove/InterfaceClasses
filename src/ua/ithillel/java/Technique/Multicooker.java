package ua.ithillel.java.Technique;

import ua.ithillel.java.AbstractDevice;

abstract class Multicooker extends AbstractDevice {

    protected void powerOn() {
    }
    protected void powerOff() {
    }
    abstract void cook();
}
