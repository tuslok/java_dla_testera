package part1.AccessModifiers;

import part1.SecondModule.User;

import static Part5.Gender.FEMALE;

public class MainApp {

    public static void main(String[] args) {

        User user = new User("Marek", "Stefanowski", "maro@start.com", 53, FEMALE);
        /*System.out.println(user.firstName);
        System.out.println(user.isUserAdult());*/

    }



}
