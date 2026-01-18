package string;
import java.util.Scanner;
public class reverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        String reverse = "";
        for (int i = input.length()-1; i>=0; i--){
            reverse = reverse+input.charAt(i);
        }
        System.out.println(reverse);
        if (reverse.equalsIgnoreCase(input)) {
            System.out.println("palindrome");
        }else {
            System.out.println("not palindrome");
        }
        scanner.close();
    }
}
