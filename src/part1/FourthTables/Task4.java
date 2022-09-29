package part1.FourthTables;

public class Task4 {

    public static void main(String[] args) {
        int[] numbers = {2, 4, 1, 9, 5, 2, 4, 0, 5, 8};

        int max;

        for(int i = 0; i < numbers.length; i++){
            max = numbers[i];
            for(int j = i+1; j < numbers.length; j++){
                if(numbers[j] > max){
                    max = numbers[j];
                    numbers[j] = numbers[i];
                    numbers[i] = max;
                }
            }
        }

        for (int number: numbers
        ) {
            System.out.print(number + " ");
        }
    }
}
