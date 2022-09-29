package Part5;

import part1.SecondModule.User;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

import static Part5.Gender.FEMALE;
import static Part5.Gender.MALE;

public class MainApp {

    public static void main(String[] args) {

        /*System.out.println(WeekDays.ŚRODA.getName());

        if("Środa".equalsIgnoreCase(WeekDays.ŚRODA.getName())){
            System.out.println("OK");
        } else {
            System.out.println("Not ok");
        }*/

        //Wyjątki - sytuacje wyjątkowe

        // 1. Dwa typy wyjątków (Musimy łapać i nie musimy łapać)
        // 2. Łapanie wyjątków
        // 3. Rzucanie wyjątków
        // 4. Dodanie wyjątów do sygnatury metody
        // 5. Tworzenie własnych wyjątków

        // 1a. Musimy łapać - Exception

        try {
            BufferedReader br = new BufferedReader(new FileReader("test.txt"));

            String line = br.readLine();

            while (line != null) {
                System.out.println(line);
                line = br.readLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            System.out.println("To wykona się zawsze!");
        }

        // 1a. Musimy łapać - Exception

        //Null Pointer Exception

        /*Bug bug = new Bug("Description", new BugReporter("Adam", "Raj", "raja@google.com"), 4);
        System.out.println(bug.getDescription());

        bug = null;
        try{
            System.out.println(bug.getDescription());
        } catch(NullPointerException ex){
            System.out.println("Poleciał null pointer exception..");
        }*/

        //Index Out Of Bounds Exception

        List<String> names = new ArrayList<>();
        names.add("Krzysztof");

        //System.out.println(names.get(1));

        names.add("Kamila");
        names.add("Jerzy");

        names.stream()
                .filter(s -> s.startsWith("K"))
                .findFirst()
                .orElseThrow(() -> new IllegalStateException("Can not find any names with given parameters.."));

        List<User> users = new ArrayList<>();
        users.add(new User("Mike", "Anderson", "random@test.com", 32, MALE));
        users.add(new User("Eva", "Tyson", "random@test.com", 36, FEMALE));
        users.add(new User("George", "Bitt", "random@test.com", 63, MALE));
        users.add(new User("Linda", "Thuram", "random@test.com", 58, FEMALE));
        users.add(new User("Alexandra", "Cross", "random@test.com", 26, FEMALE));
        users.add(new User("Michael", "Anderson", "random@test.com", 33, MALE));

        users.
                stream()
                .filter(s -> s.getGender() == FEMALE)
                .forEach(s -> System.out.println(s));

    }
}
