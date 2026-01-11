package EXAM_11th_Jan_2026_Java;
import java.util.Scanner;
public class Q1_Arithmetic_Operations_on_Two_Numbers {
    public static void main(String[] args) {
        int a, b;
        Scanner scanner = new Scanner(System.in);
            System.out.print("number 1: ");
        if (scanner.hasNextInt()) {
            a = scanner.nextInt();
            System.out.print("number 2: ");
            b = scanner.nextInt();
            System.out.println((a + b) + "\n" + (a - b) + "\n" + (a * b) + "\n" + (a / b));
        } else {
            System.out.println("invalid input");
        }
    }
}