package Loops.do_while_loop;

import java.util.Scanner;
public class reversing_number {
    public static void main(String[] args) {
        int number, reversed = 0, remainder;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        number = scanner.nextInt();

        int original = number; // Store original for display

        do {
            remainder = number % 10;           // Get last digit
            reversed = reversed * 10 + remainder; // Add to reversed number
            number = number / 10;               // Remove last digit
        } while (number != 0);

        System.out.println("Original number: " + original);
        System.out.println("Reversed number: " + reversed);

        scanner.close();
    }
}

