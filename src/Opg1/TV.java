package Opg1;

public class TV {

    private boolean powerOn;
    private int channel;
    private int volume;

    public TV() {

    }

    public void turnOn() {
        powerOn = true;
    }

    public void turnOff() {
        powerOn = false;
    }

    public void setChannel(int newChannel) {
        if (powerOn && newChannel >= 1 && newChannel <= 120) {
            channel = newChannel;
        }
    }

    public void setVolume(int newVolumeLevel) {
        if (powerOn && newVolumeLevel >= 1 && newVolumeLevel <= 7) {
            volume = newVolumeLevel;
        }
    }

    public void channelUp() {
        if (powerOn && channel < 120) {
            channel++;
        }
    }

    public void channelDown() {
        if (powerOn && channel > 1) {
            channel--;
        }
    }

    public void volumeUp() {
        if (powerOn && volume < 7) {
            volume++;
        }
    }

    public void volumeDown() {
        if (powerOn && volume > 1) {
            volume--;
        }
    }
}

