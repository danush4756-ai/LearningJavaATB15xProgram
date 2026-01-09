package Loops.For_loop;
import java.util.Scanner;
public class Interview_factorial {
    public static void main(String[] args) {
        System.out.println("Wecome to the Factorial Program");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the positive int number");

        int fact = 1;

        if (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            System.out.println(n);
            for (int i = 1; i <= n; i++) {
                fact = fact * i;
            }
            System.out.println("Factorial is => " + fact);
        } else {
            System.out.println("Please enter a valid int value");
        }

        scanner.close();


    }
}


