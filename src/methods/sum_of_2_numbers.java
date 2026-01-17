package methods;
import java.util.Scanner;
public class sum_of_2_numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b;
        System.out.print("n1: ");
   a = scanner.nextInt();
        System.out.print("n2: ");
    b = scanner.nextInt();
    int sum = sum_of_2_numbers(a , b);
        System.out.println("n1+n2= " + sum);
    }
    static int sum_of_2_numbers (int x, int y) {
        return x + y;
    }
}
