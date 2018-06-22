package receivers;

public class TvReceiver {

    private boolean isOn = false;

    public void turnOn() {
        this.isOn = true;
    }

    public void turnOff() {
        this.isOn = false;
    }

    public boolean turnedOn() {
        return this.isOn;
    }
}
