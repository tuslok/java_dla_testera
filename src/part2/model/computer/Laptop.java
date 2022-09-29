package part2.model.computer;

import java.util.Comparator;
import java.util.Objects;

public class Laptop extends Computer implements Music, Video, Comparator {

    private int batteryLevel;

    public Laptop(String name, String type, Hdd hdd, Ram ram, int batteryLevel) {
        super(name, type, hdd, ram);
        this.batteryLevel = batteryLevel;
    }

    public int volumeUp() {
        return volumeLevel = volumeLevel + 5;
    }

    public int volumeDown() {
        volumeLevel = volumeLevel - 2;
        if (volumeLevel <= 0) {
            return 0;
        } else {
            return volumeLevel;
        }

    }

    @Override
    public void switchOn() {
        System.out.println("Checking battery level..");
        if (batteryLevel > 5) {
            super.switchOn();
        } else {
            System.out.println("Battery level too low!");
        }

    }

    public void setBatteryLevel(int newBatteryLevel) {
        batteryLevel = newBatteryLevel;
    }

    @Override
    public void switchOff() {
        System.out.println("Wyłączam laptop: " + name);
        state = false;
    }


    public int volumeUp(int volume) {
        if (volumeLevel <= 100 && (volumeLevel + volume <= 100)) {
            return volumeLevel = volumeLevel + volume;
        } else {
            return volumeLevel;
        }
    }

    public int volumeDown(int volume) {
        if (volumeLevel > 0 && volumeLevel - volume > 0) {
            return volumeLevel = volumeLevel - volume;
        } else {
            return volumeLevel;
        }
    }

    @Override
    public void playMusic() {
        System.out.println("PLAY MUSIC");
    }

    @Override
    public void pauseMusic() {
        System.out.println("PAUSE MUSIC");
    }

    @Override
    public void stopMusic() {
        System.out.println("STOP MUSIC");
    }

    @Override
    public void sayHello() {
        Video.super.sayHello();
    }

    @Override
    public void playVideo() {
        System.out.println("PLAY VIDEO");
    }

    @Override
    public void pauseVideo() {
        System.out.println("PAUSE VIDEO");
    }

    @Override
    public void stopVideo() {
        System.out.println("STOP VIDEO");
    }

    @Override
    public int compare(Object o1, Object o2) {
        return 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Laptop laptop = (Laptop) o;
        return batteryLevel == laptop.batteryLevel;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), batteryLevel);
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", hdd=" + hdd +
                ", ram=" + ram +
                ", state=" + state +
                ", volumeLevel=" + volumeLevel +
                ", batteryLevel=" + batteryLevel +
                '}';
    }
}