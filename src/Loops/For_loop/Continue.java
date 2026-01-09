package Loops.For_loop;

import java.util.Scanner;

public class Continue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a no.");
        int num = scanner.nextInt();
        for (int i = 0; i < num; i++) {
            if (i == 5 || i % 2 == 0) {
                continue; //when i = 5. it goes back to start next iteration instead of going to next line
            }
            System.out.println(i);
        }
    }
}
