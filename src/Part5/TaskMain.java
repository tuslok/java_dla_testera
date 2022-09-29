package Part5;

import part1.SecondModule.Bug;
import part1.SecondModule.BugReporter;
import part1.SecondModule.User;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

import static Part5.Gender.FEMALE;
import static Part5.Gender.MALE;

public class TaskMain {

    public static void main(String[] args) throws IOException {

        List<User> users = new ArrayList<>();
        users.add(new User("Mike", "Anderson", "random@test.com", 32, MALE));
        users.add(new User("Eva", "Tyson", "random@test.com", 36, FEMALE));
        users.add(new User("George", "Bitt", "random@test.com", 63, MALE));
        users.add(new User("Linda", "Thuram", "random@test.com", 58, FEMALE));
        users.add(new User("Alexandra", "Cross", "random@test.com", 26, FEMALE));
        users.add(new User("Michael", "Anderson", "random@test.com", 33, MALE));

        users.
                stream()
                .filter(s -> s.getGender().equals(FEMALE))
                .forEach(s -> System.out.println(s));

        String data = "Marek\n" +
                "Klaudia\n" +
                "Stefan\n" +
                "Tomasz\n" +
                "Judyta";

        try {
            FileWriter file = new FileWriter("names.txt");
            BufferedWriter out = new BufferedWriter(file);
            out.write(data);
            out.close();
        } catch(Exception e) {
            e.getStackTrace();
        }

        List<String> usersTask = new ArrayList<>();

        try {
            BufferedReader reader = new BufferedReader(new FileReader("names.txt"));
            String line = reader.readLine();

            while (line != null) {
                System.out.println(line);
                usersTask.add(line);
                line = reader.readLine();
            }
        } catch(FileNotFoundException e){
            e.printStackTrace();
        } catch(IOException e){
            e.printStackTrace();
        }


        for (String user : usersTask) {
            System.out.println(user);
        }

        String s = usersTask.
                stream().
                filter(u -> u.startsWith("S"))
                .findFirst()
                .orElseThrow(() -> new IllegalStateException("Not found name."));

        System.out.println(s);

        Bug bug = new Bug("Description", new BugReporter("Olek", "Stefanski", "stefanski@go.com"), 4);
        bug.setBugPriority(19);

    }
}
