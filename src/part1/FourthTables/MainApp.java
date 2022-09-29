package part1.FourthTables;

import java.util.Locale;

public class MainApp {

    public static void main(String[] args) {

        // 1. Tablica - zbiór danych tego samego typu
        // Zawsze musimy określić rozmiar tablicy
        // Ostatni element tablicy - 1
        // [] - tablica
        // int[] numbers = new int[10]

        String[] names = new String[5];

        // wartości tablicy ["Michał"]["Marcin"]["Józef"]["Maria"]["Kasia"]
        // index tablicy    [   0,      1,          2,      3,        4     ]

        names[0] = "Michał";
        names[1] = "Marcin";
        names[2] = "Józef";
        names[3] = "Maria";
        names[4] = "Kasia";

        // Element tablicy, który nie istnieje -> Index 5 out of bounds for length 5

        for(int i = 0; i < names.length; i++){
            if (i % 2 == 0){
                System.out.println(i + 1 + ". "+ names[i]);
            }
        }

        for (String name: names
             ) {
            System.out.println(name);
        }

        int []numbers = new int[10];

        System.out.println("Długość tablicy numbers: " + numbers.length);

        int []newNumbers = {5, 9, 2, 3, 6};

        String[]newNames = {"Marek", "Olek", "Stanisława", "Teresa", "Julia"};
        System.out.println("Długość tablicy newNames: " + newNames.length);

        for (String name:newNames
             ) {
            System.out.println(name.toUpperCase(Locale.ROOT));
        }

        for(int i = 0; i <newNames.length; i++){
            System.out.println(newNames[i].toLowerCase(Locale.ROOT));
        }

        int number = 10;
        number = number + 1; // lub number +=1
        System.out.println(number);



    }
}
