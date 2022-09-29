package part4;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MainSteams {

    public static void main(String[] args) {

        // STREAMY - strumienie wartości

        List<String> names = new ArrayList<>();
        names.add("Marek");
        names.add("Julian");
        names.add("Marta");
        names.add("Lena");
        names.add("Józef");
        names.add("Franciszek");
        names.add("Feliks");
        names.add("Renata");
        names.add("Grzegorz");
        names.add("Filip");

        // Metody pośrednie - zwracją nowe streamy
        // filter -> filtrowanie elementów
        // map - przekształcenie elementów

        //Metody terminalne - są wykonywane jako ostatnie - zwracają wartość, pozwalają zebrać warości do kolekcji
        // forEach - wyświetlanie elementów
        // min, max, sum
        // anyMatch, allMatch, nonMatch
        // count
        // collect -> zebranie elementów

        names.stream()
                .filter(str -> str.startsWith("F"))
                .filter(str -> str.contains("k"))
                .filter(str -> str.endsWith("s"))
                .forEach(System.out::println);

        names.stream()
                .map(str -> str.toUpperCase())
                .forEach(str -> System.out.println(str));

        names.stream()
                .filter(str -> str.length() <= 4)
                .map(str -> "Short name: " + str)
                .forEach(str -> System.out.println(str));

        long count = names.stream()
                .filter(str -> str.length() <= 4)
                .count();
        System.out.println(count);

        boolean anyMatch = names.stream()
                .anyMatch(s -> s.contains("a"));

        System.out.println(anyMatch);

        boolean allMatch = names.stream()
                .allMatch(s -> s.length() > 4);

        System.out.println(allMatch);

        boolean noneMatch = names.stream()
                .noneMatch(str -> str.endsWith("ski"));

        System.out.println(noneMatch);

        List<String> fNames = names.stream()
                .filter(str -> str.startsWith("F"))
                .collect(Collectors.toList());

        System.out.println(fNames);

    }
}
