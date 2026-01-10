package Ternary_Operator;

import java.util.Scanner;

public class score_grade {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int score = sc.nextInt();
            String result = (score > 100 || score < 1) ? "invalid input"
                    : (score >= 90 && score <= 100) ? "A"
                    : (score >= 80 && score <= 89) ? "B"
                    : (score >= 70 && score <= 79) ? "C"
                    : (score > 60 && score <= 69) ? "D" : "F";
            System.out.println(result);
        } else {
            System.out.println("invalid input");
        }
    }
}