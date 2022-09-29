package part3;


import Part5.Gender;
import part1.SecondModule.User;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<User> users = new ArrayList<>();
        users.add(new User("Marek", "Nowak", "marek@test.com", 29, Gender.MALE));
        users.add(new User("Juliusz", "Kowalski", "kowalski@test.com", 17, Gender.MALE));
        users.add(new User("Oliwier", "Sztos", "oliwier@sztos.com", 34, Gender.MALE));
        users.add(new User("Jakub", "Michalak", "jmichal@google.com", 30, Gender.MALE));

        for (User user : users) {
            System.out.println(user.getFirstName());
        }

        Collections.sort(users, Comparator.comparing(User::getFirstName));
        System.out.println(users);
        System.out.println("-------------");

        Collections.sort(users, Comparator.comparingInt(User::getAge));
        System.out.println(users);
        System.out.println("-------------");
    }
}
