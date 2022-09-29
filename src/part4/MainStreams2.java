package part4;

import Part5.Gender;
import part1.SecondModule.User;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class MainStreams2 {

    public static void main(String[] args) {

        List<User> users = new ArrayList<User>();
        users.add(new User("Bartosz", "Zientek", "bart@google.com", 43, Gender.MALE));
        users.add(new User("Stefan", "Mirowski", "mirowski@gmail.com", 16, Gender.MALE));
        users.add(new User("Szymon", "Szymański", "szymanskiszymon@google.com", 61, Gender.MALE));
        users.add(new User("Marta", "Nowak", "marta@nowak.com", 35, Gender.FEMALE));
        users.add(new User("Karolina", "Stefańska", "stefanskaka@google.com", 43, Gender.FEMALE));
        users.add(new User("Aleksandra", "Gracz", "agracz@support.com", 55, Gender.FEMALE));

        List<User> sortedUsers = users.stream()
                .sorted(Comparator.comparing(User::getFirstName).thenComparing(User::getLastName).thenComparing(User::getAge))
                .collect(Collectors.toList());

        for (User user : sortedUsers) {
            System.out.println(user.getFirstName() + ", " + user.getLastName() + ", " + user.getEmail() + ", " + user.getAge());
        }

        // Optional - opakowanie dla obiektu
        // Optional [ obiekt ] / Optional [ ]
        // Zabezpieczenie przed nullami

        Optional<User> max = users.stream()
                .max(Comparator.comparingInt(User::getAge));

        //System.out.println(max.get());

        if(max.isPresent()){
            System.out.println("Is present: " + max.get());
        } else{
            System.out.println("Missing elements");
        }

        String aleksandra = users.stream()
                .map(User::getFirstName)
                .filter(s -> s.equals("Aleksandra"))
                .findFirst()
                .orElse("Aleksandra doesn't exist");
        System.out.println(aleksandra);


        Integer age = users.stream()
                .map(User::getAge)
                .max(Integer::compareTo)
                .orElse(-1);
        System.out.println(age);

        //Interfejsy funkcyjne
        // Predicate - pobieranie wartości, sprawdzanie i zwraca boolean
        // Consumer - pobieranie jednej wartości i nic nie zwraca
        // Supplier - dostarcza nowe wartości

        User userWithB = users.stream()
                .filter(user -> user.getFirstName().contains("B"))
                .findFirst()
                .orElseGet(() -> new User("Michał", "Masłowski", "maslomichala@google.com", 36, Gender.FEMALE));
        System.out.println(userWithB);

        User userWithSz = users.stream()
                .filter(user -> user.getFirstName().contains("Sz"))
                .findFirst()
                .orElseThrow(() -> new IllegalStateException("Missing user/users.."));
        System.out.println(userWithSz);


        users.stream()
                .filter(user -> user.getFirstName().contains("Sz"))
                .findFirst()
                .ifPresent(user -> System.out.println(user));

        users.stream()
                .filter(user -> user.getFirstName().contains("Sz"))
                .findFirst()
                .ifPresentOrElse(user -> System.out.println(user), () -> System.out.println("Missing user/users.."));

    }

}
