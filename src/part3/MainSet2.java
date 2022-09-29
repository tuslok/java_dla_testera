package part3;


import Part5.Gender;
import part1.SecondModule.User;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class MainSet2 {

    public static void main(String[] args) {
        Set<User> users = new HashSet<User>();

        users.add(new User("Mirosław", "Nowak","miro@test.com",29, Gender.MALE));
        users.add(new User("Karolina", "Michalak","karolina@mich.com",42, Gender.FEMALE));
        users.add(new User("Stefan", "Dąb","sdab@test.us",23, Gender.MALE));
        users.add(new User("Karol", "Graczyk","graczyk_k@google.com",19, Gender.MALE));
        users.add(new User("Cris", "Ronaldo","cr7@gmail.com",36, Gender.MALE));
        users.add(new User("Mirosław", "Nowak","miro@test.com",29, Gender.MALE)); // dublikat dlatego size = 5

        System.out.println(users.size());

        /*for (User user : users){
            System.out.println(user.getFirstName() + " " + user.getLastName());
        }*/

        Set<User> sortedUsers = new TreeSet<>(users);
        for(User user : sortedUsers){
            System.out.println(user.getFirstName() + " " + user.getLastName());
        }



    }
}
