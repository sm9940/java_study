package ch08.sec04;


public class RemoteControlExample {
    public static void main(String[] args) {
        RemoteControl rc;
        rc = new Television();
        rc.turnOn();
        rc.setVolume(5);
        rc.turnOff();

        rc.setMute(true);

        rc.setMute(false);

        rc =new Audio();
        rc.turnOn();
        rc.setVolume(15);
        System.out.println();
        rc.setMute(true);
        rc.setMute(false);
        rc.turnOff();

        RemoteControl.changeBattery();
    }
}
