package EXAM_11th_Jan_2026_Java;
import java.util.Scanner;
public class Q6_Day_of_the_Week {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select number from 1 to 7");
        if (scanner.hasNextInt()) {
            int day = scanner.nextInt();
            switch (day) {
                case 1 -> System.out.println("Sunday");
                case 2 -> System.out.println("Monday");
                case 3 -> System.out.println("Tuesday");
                case 4 -> System.out.println("Wednesday");
                case 5 -> System.out.println("Thursday");
                case 6 -> System.out.println("Friday");
                case 7 -> System.out.println("Saturday");
                default -> System.out.println("invalid input");
            }} else{
                System.out.println("invalid input");
            }
        }
    }
