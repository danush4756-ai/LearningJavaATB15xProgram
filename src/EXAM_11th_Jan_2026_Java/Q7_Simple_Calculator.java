package EXAM_11th_Jan_2026_Java;
import java.util.Scanner;
public class Q7_Simple_Calculator {
    public static void main() {
        Scanner scanner = new Scanner(System.in);
        double n1, n2;
        System.out.println("enter number 1");
        if (scanner.hasNextInt()) {
        n1 = scanner.nextInt();
        System.out.println("enter number 2");
            if (scanner.hasNextInt()) {
        n2 = scanner.nextInt();
        System.out.println("choose the operation");
        String operator = scanner.next();
        switch (operator) {
            case "+" -> System.out.println(n1+n2);
            case "-" -> System.out.println(n1-n2);
            case "/" -> System.out.println(n1/n2);
            case "*" -> System.out.println(n1*n2);
            default -> System.out.println("enter valid operator");
        } }else {
            System.out.println("invalid input");
        }}else {
            System.out.println("invalid input");
        }
    }
}
