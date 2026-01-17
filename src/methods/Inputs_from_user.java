package methods;
import java.util.Scanner;
public class Inputs_from_user {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
int n1, n2;
        n1 = input(scanner,"n1: ");
        n2 = input(scanner,"n2: ");
        int sum = sum(n1, n2); /*here we are using sum as variable and sum(...) as method but we cannot
        duplicate method name with another method name and cannot duplicate variable name with another
        variable name*/
        System.out.println(sum);
        int sub = sub(n1, n2);
        System.out.println(sub);
        int divide = division(n1, n2);
        System.out.println(divide);
        int multiple = multiple(n1, n2);
        System.out.println(multiple);
        int mod = mod(n1,n2);
        System.out.println(mod);
        scanner.close();
    }
    static int input(Scanner scanner, String prompt) {
        System.out.println(prompt);
        if (scanner.hasNextInt()) {
            return scanner.nextInt();
        } else {
            System.out.println("enter input only in numbers");
            System.exit(0);/*this doesn't make technical difference and even is not convention
            and this point is applicable only to this case*/
            return 0;
        }
    }
    static int sum (int x, int y) {
        return x+y;
    }
    static int sum (int x, int y, int z) { //no error because parameters are different
        return x+y;
    }
    static int add(int x, int y) {      // ✅ NO ERROR because method name is different
        return x + y;
    }
    //static double sum (int x, int y) {
      //  return x + y;
    //} changing only return type will not make a method different so it is an error
    static int sub (int x, int y) {
        return x-y;
    }
    static int multiple (int x, int y) {
        return x*y;
    }
    static int division (int x, int y) {
        if (y == 0) {
            throw new ArithmeticException("Division by zero is not allowed."); /* this is to customized
            error message but technically it doesn't make any difference and this point is applicable
            only to this case but in convention it is only used */
        }
        return x/y;
    }
    static int mod (int x, int y) {
        return x%y;
    }
}
