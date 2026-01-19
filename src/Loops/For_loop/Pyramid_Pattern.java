package Loops.For_loop;

public class Pyramid_Pattern {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 0; i<5; i++) {
            for (int j = 0; j < n-i-1; j++) {
                System.out.print(" ");
            }
            for (int a = 0; a <= i; a++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
