package part1.FivthLoopAndStatic;

public class MainApp {

    public static void main(String[] args) {
        int number = 10;

        while(number < 20){
            System.out.print(number + " ");
            number++;
        }
        System.out.println("");

        // DO-WHILE wykona conajmiej raz kod
        do {
            System.out.print(number + " ");
            number++;
        }while(number < 30);
    }
}
