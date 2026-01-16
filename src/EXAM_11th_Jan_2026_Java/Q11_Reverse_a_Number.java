package EXAM_11th_Jan_2026_Java;
import java.util.Scanner;
public class Q11_Reverse_a_Number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int remainder, reversed_number = 0;
        do {
            remainder = number%10;
            reversed_number = reversed_number*10 + remainder;
            number = number/10;
        } while (number!=0);
        System.out.println(reversed_number);
    }
}

