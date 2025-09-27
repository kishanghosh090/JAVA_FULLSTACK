package oop;

public interface controllableDevice {
    void turnOn();
    void turnOff();

    default int getStatus(){
        return 200;
    }
}
