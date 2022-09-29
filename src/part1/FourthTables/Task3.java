package part1.FourthTables;

public class Task3 {

    public static void main(String[] args) {

        int[] numbers = {2, 4, 1, 9, 5, 2, 4, 0, 5, 8};

        int min;
        for (int i = 0; i < numbers.length; i++) {
            min = numbers[i];
            for(int j = i+1; j < numbers.length; j++) {
                if(numbers[j] < min){
                    min = numbers[j];
                    numbers[j] = numbers[i];
                    numbers[i] = min;
                }
            }
        }

        for (int number: numbers
             ) {
            System.out.print(number + " ");
        }

    }
}
