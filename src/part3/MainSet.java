package part3;

import java.util.*;

public class MainSet {

    public static void main(String[] args) {

        // Set = zbiór uniklanych elementów
        Set<String> names = new HashSet<String>();
        names.add("Bartek");
        names.add("Jacek");
        names.add("Anna");
        names.add("Olga");
        names.add("Maria");
        names.add("Bartek");

        System.out.println(names.size());

        System.out.println("-------");

        /*for (String name : names) {
            System.out.println(name);
        }*/

        System.out.println("-------");

        Set<String> sortedNames = new TreeSet<String>(names);
        for (String name : sortedNames) {
            System.out.println(name);
        }

    }
}
