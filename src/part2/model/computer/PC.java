package part2.model.computer;

import java.util.Comparator;
import java.util.Objects;

public class PC extends Computer implements Comparator {

    private boolean isPowerSupply;

    public PC(String name, String type, Hdd hdd, Ram ram) {
        super(name, type, hdd, ram);
        isPowerSupply = false;
    }


    public void setIsPoweredOn(boolean powerSupply) {
        isPowerSupply = powerSupply;
    }

    @Override
    public void switchOn() {
        System.out.println("Checking power supply..");
        if(isPowerSupply){
            super.switchOn();
        } else{
            System.out.println("Power supply missing..");
        }
    }

    @Override
    public int volumeUp() {
        return 0;
    }

    @Override
    public int volumeUp(int volume) {
        throw new UnsupportedOperationException("This method is not supported to PC");
    }

    @Override
    public int volumeDown() {
        return 0;
    }

    public int volumeDown(int volume) {
        if (volumeLevel > 0 && volumeLevel - volume > 0) {
            return volumeLevel = volumeLevel - volume;
        } else {
            return volumeLevel;
        }
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
        PC pc = (PC) o;
        return isPowerSupply == pc.isPowerSupply;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), isPowerSupply);
    }

    @Override
    public String toString() {
        return "PC{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", hdd=" + hdd +
                ", ram=" + ram +
                ", state=" + state +
                ", volumeLevel=" + volumeLevel +
                ", isPowerSupply=" + isPowerSupply +
                '}';
    }
}