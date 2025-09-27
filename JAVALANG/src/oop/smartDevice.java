package oop;

public class smartDevice implements controllableDevice{
    private boolean isOn = false;
    @Override
    public void turnOn() {
        isOn = true;
        System.out.println("smart device is turn on");
    }

    @Override
    public void turnOff() {
        isOn = false;
        System.out.println("smart device is turn off");
    }
}
