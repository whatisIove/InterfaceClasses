package ua.ithillel.java;

abstract public class AbstractDevice {

    private String name;
    private int serial;

    protected abstract void powerOn();
    protected abstract void powerOff();
    public AbstractDevice() {
        powerOn();
    }

}
