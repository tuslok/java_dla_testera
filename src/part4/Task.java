package part4;

import Part5.Gender;
import part1.SecondModule.User;
import part2.model.computer.*;

import java.util.*;
import java.util.stream.Collectors;


public class Task {

    public static void main(String[] args) {

        List<Computer> computers = new ArrayList<>();
        computers.add(new Laptop("MB Pro 1", "Pro 1", new Hdd("Toshiba", 500), new Ram("Corsair", 128), 95));
        computers.add(new Laptop("MB Pro 2", "Pro 2", new Hdd("Toshiba", 500), new Ram("Corsair", 128), 95));
        computers.add(new Laptop("MB Pro 3", "Pro 3", new Hdd("HP", 256), new Ram("Corsair", 256), 100));
        computers.add(new Laptop("MB Pro 7", "Pro 7", new Hdd("Samusng", 500), new Ram("GoodRam", 512), 95));

        computers.add(new PC("PC Max 100", "Max 100", new Hdd("Toshiba", 256), new Ram("GoodRam", 128)));
        computers.add(new PC("PC Max 500", "Max 500", new Hdd("MSI", 500), new Ram("Corsair", 500)));
        computers.add(new PC("PC Max 5000X", "Max 5000X", new Hdd("Toshiba", 256), new Ram("Corsair", 128)));

        // 1. Zliczyć wszystkie komputery, które mają więcej niż 128 gb ramu

        long ramAbove128 = computers.stream()
                .filter(comp -> comp.getRam().getSize() > 128)
                .count();

        System.out.println("Computers with number of RAM bigger than 128 GB: " + ramAbove128);

        // 2. Wyświetlić na konsole wszystkie typy komputerów - map

        computers.stream()
                .map(Computer::getType)
                        .forEach(System.out::println);

        // 3. Wyświetlić komputer, który ma najwięcej ramu

        Computer max = computers
                .stream()
                .max(Comparator.comparingInt(comp -> comp.getRam().getSize()))
                .orElseThrow(() -> new IllegalStateException("Not found.."));

        System.out.println("Computer with the biggest size of RAM: " + max.getName());

        // 4. Utworzyć nową kolekcje z komputerami, które mają dysk mniejszy niż 500 gb

        List<Computer> collectToList = computers
                .stream()
                .filter(comp -> comp.getHdd().getSize() < 500)
                .collect(Collectors.toList());

            for (Computer comp : collectToList){
                System.out.println(comp.getName() + " " +  comp.getHdd());
            }

        // 5. Posortować komputery po nazwie i typie

        System.out.println("Sorted by name and type: ");
        List<Computer> compSorted = computers
                .stream()
                .sorted(Comparator.comparing(Computer::getName).thenComparing(Computer::getType))
                .collect(Collectors.toList());

        for (Computer comp : compSorted){
            System.out.println(comp.getName() + " " + comp.getType());
        }


        // 6. Przećwiczyć Optional

        List<User> users = new ArrayList<>();
        users.add(new User("Michał", "Kowalski", "kowalski@test.com", 50, Gender.MALE));

        Optional<User> min = users.stream()
                .min(Comparator.comparingInt(User::getAge));

        // get()
        // isPresent()
        System.out.println("get() and isPresent()");
        if(min.isPresent()){
            System.out.println("Is present: " + min.get());
        } else{
            System.out.println("Missing user/s..");
        }

        // orElse()
        System.out.println("orElse()");
        String maxComp = computers
                .stream()
                .map(Computer::getType)
                .filter(comp -> comp.contains("Max"))
                .findFirst()
                .orElse("No records..");
        System.out.println(maxComp);

        //orElseGet()
        System.out.println("orElseGet()");
        User u = users
                .stream()
                .filter(user -> user.getLastName().startsWith("K"))
                .findAny()
                .orElseGet(() -> new User("Mark", "Tomaszewski", "tomaszmark@test.com", 45, Gender.MALE));
        System.out.println(u);

        Computer computer100 = computers
                .stream()
                .filter(comp -> comp.getType().contains("Max 100"))
                .findFirst()
                .orElseGet(() -> new Computer("fsafas", "gsagas", new Hdd("sagas", 313), new Ram("sa", 320)));
        System.out.println(computer100);


        // orElseThrow
        System.out.println("orElseThrow()");
        Computer computer = computers
                .stream()
                .filter(comp5000X -> comp5000X.getName().contains("5000X"))
                .findAny().
                orElseThrow(() -> new IllegalStateException("Not found.."));
        System.out.println(computer);

        // ifPresent()
        System.out.println("ifPresent()");
        users
                .stream()
                .filter(user -> user.getFirstName().startsWith("M"))
                .findAny()
                        .ifPresent(user -> System.out.println(user));

        // ifPresentOrElse()
        System.out.println("ifPresentOrElse()");
        computers
                .stream()
                .filter(comp500 -> comp500.getName().contains("5000X"))
                .findFirst()
                .ifPresentOrElse(comp500 -> System.out.println(comp500), () -> System.out.println("Not found computer.."));

    }

}
