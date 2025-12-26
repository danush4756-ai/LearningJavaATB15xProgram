package IF_ELSE;

import java.util.Scanner;

public class TASK_27_dec_2025 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        a = sc.nextInt(); b = sc.nextInt(); c = sc.nextInt();
        if (a==b && a==c) {
            System.out.println("equilateral triangle");
        } else if (a==b || a==c ||c==b)  {
            System.out.println("isosceles triangle");
        }else {
            System.out.println("scalene triangle");
    }
        sc.close();
    }

}

