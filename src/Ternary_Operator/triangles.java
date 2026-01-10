package Ternary_Operator;
import java.util.Scanner;
public class triangles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        a = sc.nextInt(); b = sc.nextInt(); c = sc.nextInt();
        String result = (a==b && a==c) ? "equilateral triangle" : (a==b || a==c ||c==b) ? "isosceles triangle"
                : "scalene triangle";
        System.out.println(result);
    }
}
