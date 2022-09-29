package part2.model.computer;

import java.util.Comparator;
import java.util.Objects;

public class Computer implements Comparator {

    protected String name;
    protected String type;
    protected Hdd hdd;
    protected Ram ram;
    protected boolean state;
    protected int volumeLevel;

    public Computer(String name, String type, Hdd hdd, Ram ram) {
        this.name = name;
        this.type = type;
        this.hdd = hdd;
        this.ram = ram;
        this.state = false;
        this.volumeLevel = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Hdd getHdd() {
        return hdd;
    }

    public void setHdd(Hdd hdd) {
        this.hdd = hdd;
    }

    public Ram getRam() {
        return ram;
    }

    public void setRam(Ram ram) {
        this.ram = ram;
    }

    public void switchOn() {
        System.out.println("SUPER - ustawiam pole state na true.");
        state = true;
    }

    public void switchOff(){
        System.out.println("Wyłączam komputer: " + name);
        state = false;
    }

    public boolean getState() {
        return state;
    }

    public int volumeUp() {
        return 0;
    }

    public int volumeUp(int volume) {
        return 0;
    }

    public int volumeDown() {
        return 0;
    }

    public int volumeDown(int volume) {
        return 0;
    }

    @Override
    public int compare(Object o1, Object o2) {
        return 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Computer computer = (Computer) o;
        return state == computer.state && volumeLevel == computer.volumeLevel && Objects.equals(name, computer.name) && Objects.equals(type, computer.type) && Objects.equals(hdd, computer.hdd) && Objects.equals(ram, computer.ram);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, type, hdd, ram, state, volumeLevel);
    }

    @Override
    public String toString() {
        return "Computer{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", hdd=" + hdd +
                ", ram=" + ram +
                ", state=" + state +
                ", volumeLevel=" + volumeLevel +
                '}';
    }
}
