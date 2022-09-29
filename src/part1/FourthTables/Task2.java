package part1.FourthTables;

public class Task2 {


    public static void main(String[] args) {
        int [] numbers = {2, 2, 3, 4, 5, 7, 7, 7, 8, 8, 2};

        int odd = 0;
        int even = 0;
        int sumOfOdds = 0;
        int sumOfEven = 0;

        for(int i = 0; i < numbers.length; i++) {
            if(i % 2 == 0){
                even = even + i;
                sumOfEven = sumOfEven + 1;
            } else{
                odd = odd + i;
                sumOfOdds = sumOfOdds + 1;
            }
        }

        System.out.println("Odd: " + odd + ", number of odds: " + sumOfOdds);
        System.out.println("Even: " + even + ", number of even: " + sumOfEven);
    }


}
