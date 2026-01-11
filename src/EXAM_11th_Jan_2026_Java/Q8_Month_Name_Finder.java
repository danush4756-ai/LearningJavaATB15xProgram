package EXAM_11th_Jan_2026_Java;

import java.util.Scanner;

public class Q8_Month_Name_Finder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select number from 1 to 7");
        if (scanner.hasNextInt()) {
            int month = scanner.nextInt();
            switch (month) {
                case 1 -> System.out.println("jan");
                case 2 -> System.out.println("feb");
                case 3 -> System.out.println("march");
                case 4 -> System.out.println("april");
                case 5 -> System.out.println("may");
                case 6 -> System.out.println("june");
                case 7 -> System.out.println("july");
                case 8 -> System.out.println("aug");
                case 9 -> System.out.println("sep");
                case 10 -> System.out.println("oct");
                case 11 -> System.out.println("nov");
                case 12 -> System.out.println("dec");
                default -> System.out.println("invalid input");
            }} else{
            System.out.println("invalid input");
        }
    }
}

