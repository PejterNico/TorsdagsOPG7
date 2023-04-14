package Opg1;

public class TV {

    private boolean powerOn = true;
    private int channel = 1;
    private int volume = 0;

    public int getChannel() {
        return channel;
    }

    public TV() {
        this.channel = 1;
        this.volume = 0;
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

