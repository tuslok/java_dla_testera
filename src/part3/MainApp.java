package part3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainApp {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Józef");
        names.add("Marek");
        names.add("Anna");
        names.add("Jarosław");

        List<String> names1 = new ArrayList<>();
        names.add("Krzyszof");
        names.add("Raul");

        System.out.println(names);
        System.out.println("------------");

        for (String name : names) {
            System.out.println(name);
        }
        System.out.println("------------");

        names.remove(0); // Józef
        names.remove("Anna");
        System.out.println(names);
        System.out.println("------------");
        String name = names.get(1);
        System.out.println(name);
        System.out.println("------------");

        System.out.println(names.size());
        System.out.println("------------");

        System.out.println(names.isEmpty());
        System.out.println("------------");

        System.out.println(names.contains("Marek"));
        System.out.println("------------");

        names.addAll(names1);
        System.out.println(names);
        System.out.println("------------");

        Collections.sort(names);
        System.out.println(names);
        System.out.println("------------");


        Collections.reverse(names);
        System.out.println(names);
        System.out.println("------------");
    }
}
