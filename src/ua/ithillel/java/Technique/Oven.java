package ua.ithillel.java.Technique;




import java.time.LocalDateTime;

public class Oven extends Multicooker {

    private int initTimer;

    @Override
    protected void powerOn() {
        System.out.println("Oven is on and heating up.");
    }

    public void initTimer(int initTimer) {
        System.out.println("Set the time and prepare the dish for cooking.");
        LocalDateTime timeToFinish = LocalDateTime.now().plusMinutes(initTimer);
        System.out.println("Your meal is being cooked " + timeToFinish);
    }

    @Override
    public void cook() {
        System.out.println("Cooking... you can pull your dish.");
    }

    @Override
    public void powerOff() {
        System.out.println("Oven off and cooling down.");
    }

    public int getInitTimer() {
        return initTimer;
    }

    public void setInitTimer(int initTimer) {
        this.initTimer = initTimer;
    }
}
