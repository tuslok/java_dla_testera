package part2;

import part2.model.computer.*;

public class MainApp {

    public static void main(String[] args) {

        /*Computer officeComputer = new PC("Office computer", "Dell", 500, 120);
        Computer gamingLaptop = new Laptop("Gaming laptop 1", "HP", 500, 256, 50);
        Computer gamingLaptop1 = new Laptop("Gaming laptop 2", "MSI", 500, 512, 95);
        Computer mac = new Laptop("MB PRO", "PRO", 250, 256, 99);

        Computer computer = new Laptop("Maaaa", "PRaaaaa", 250, 256, 99);

        Laptop newLaptop = new Laptop("Zen Book", "Dell", 250, 256, 56);
        newLaptop.playMusic();
        newLaptop.pauseMusic();
        newLaptop.stopMusic();

        newLaptop.playVideo();
        newLaptop.pauseVideo();
        newLaptop.stopVideo();
        newLaptop.sayHello();*/

        Hdd hdd = new Hdd("Samsung", 1000);
        Ram ram = new Ram("Corsair", 128);

        Computer mac1 = new Laptop("Mac", "Pro", hdd, ram,85);
        System.out.println(mac1.getRam().getSize());

        Computer mac2 = new Laptop("Mac", "Pro Max", new Hdd("AppleHdd", 500), new Ram("MacRam", 64),36);


        /*System.out.println(officeComputer.volumeUp());
        System.out.println(officeComputer.volumeUp());

        System.out.println(officeComputer.volumeDown());
        System.out.println(officeComputer.volumeDown());
        System.out.println(officeComputer.volumeDown());*/

        /*System.out.println(gamingLaptop.volumeUp(77));
        System.out.println(gamingLaptop.volumeUp(24));

        System.out.println(gamingLaptop.volumeDown(3));
        System.out.println(gamingLaptop.volumeDown(10));
        System.out.println(gamingLaptop.volumeDown(15));
        System.out.println(gamingLaptop.volumeDown(7));

        System.out.println(gamingLaptop.volumeUp(77));*/

        //Computer mac2 = new Computer("MB PRO", "PRO", 250, 256, 99)

        //officeComputer.volumeUp();

        //officeComputer.switchOn();
        //System.out.println(officeComputer.getState());

        //officeComputer.setIsPoweredOn(true);
        //officeComputer.switchOn();
        //System.out.println(officeComputer.getState());

        //gamingLaptop.setBatteryLevel(4);

        //gamingLaptop.switchOn();
        //System.out.println(gamingLaptop.getState());

        //officeComputer.showComputerName();

        /*Computer[] computers = {officeComputer, gamingLaptop, gamingLaptop1, mac};

        for (Computer computer : computers)
             computer.switchOff(); {
        }

        //rzutowanie na typ PC
        ((PC) officeComputer).showComputerName();*/

    }
}
