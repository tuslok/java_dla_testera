package FirstModule;

public class Zadanie1 {

    // 1. 4 zmienne typu int
    // 2. Sprawdź czy suma dwóch pierwszych jest parzysta
    // 3. Sprawdź czy suma dwóch kolejnych jest parzysta
    // 4. Jeżeli dwie sumy są parzyste to wyświetl informacje, że wszystkie liczby są parzyste

    public static void main(String[] args) {
        int number1 = 143;
        int number2 = 634;
        int number3 = 165;
        int number4 = 497;

        int sumOfTwoFirstNumber = number1 + number2;
        int sumOfTwoSecondNumber = number3 + number4;

        if (sumOfTwoFirstNumber % 2 == 0) {
            System.out.println("Parzyste, bo suma to: " + sumOfTwoFirstNumber);
        } else {
            System.out.println("Nieparzyste, bo suma to: " + sumOfTwoFirstNumber);
        }

        if (sumOfTwoSecondNumber % 2 == 0) {
            System.out.println("Parzyste, bo suma to: " + sumOfTwoSecondNumber);
        } else {
            System.out.println("Nieparzyste, bo suma to:" + sumOfTwoSecondNumber);
        }

        if (sumOfTwoFirstNumber % 2 == 0 && sumOfTwoSecondNumber % 2 == 0) {
            System.out.println("Wszystkie liczby są parzyste, bo sumy to: " + sumOfTwoFirstNumber + " i " + sumOfTwoSecondNumber);
        } else {
            System.out.println("Nie wszystkie liczby są parzyste, bo sumy to: " + sumOfTwoFirstNumber + " i " + sumOfTwoSecondNumber);
        }
    }

}
