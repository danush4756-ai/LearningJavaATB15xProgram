package Loops.do_while_loop;
import java.util.Scanner;
public class factorial {
    public static void main(String[] args) {
        int fact = 1;
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            int i = 1;
            do {
                fact = fact * i;
                i++;
            } while (i <= n);
            System.out.println("factorial value: " + fact);
        } else {
            System.out.println("invalid input");
        }
    }
}
