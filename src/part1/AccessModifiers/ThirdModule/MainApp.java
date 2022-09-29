package part1.AccessModifiers.ThirdModule;

public class MainApp {

    public static void main(String[] args) {

        String str1 = "Hello";
        String str2 = "hello";

        /*// porównanie napisów
        System.out.println(str1.equals(str2));

        // porównanie napisów bez wielkości liter
        System.out.println(str1.equalsIgnoreCase(str2));

        // wszystkie duże liery
        String strUp = str1.toUpperCase();
        System.out.println(strUp);

        // wszystkie małe liery
        strUp = str1.toLowerCase();
        System.out.println(strUp);

        // sprawdzenie czy zaczyna się od 'll' w indeksie numer 2 (3 litera)
        boolean str1StartWith = str1.startsWith("ll", 2);
        System.out.println(str1StartWith);

        // sprawdzenie czy kończy się na 'lo'
        System.out.println(str1.endsWith("lo"));

        //sprawdzenie czy tekst zawiera 'ell'
        System.out.println(str1.contains("ell"));*/

        System.out.println("    b".isBlank()); // sprawdza długość ale ignoruje spacje
        System.out.println("".isEmpty()); // sprawdza długość wliczając space

        String replace = str1.replaceAll("lo", "IKOPTER");
        System.out.println(replace);

        String strAll = str1.replaceAll("o", "X");
        System.out.println(strAll);

        String str1Sub = str1.substring(0,2);
        System.out.println(str1Sub);

        String textWithWhiteSpace = "   text + jakieś spacje . ";
        System.out.println(textWithWhiteSpace.length());

        // usunięcie spacji przed tekstem o po tekście
        String textStrip = textWithWhiteSpace.strip();
        System.out.println(textStrip);
        System.out.println(textStrip.length());
    }
}
