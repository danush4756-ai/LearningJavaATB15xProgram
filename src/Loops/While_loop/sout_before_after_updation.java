package Loops.While_loop;

public class sout_before_after_updation {
    public static void main(String[] args) {
        int i = 0; // Init
        while (i < 10) {//condition
            System.out.print(i+" ");//prints till 0 to 9 because it works like post increment
            ++i; // Updation
        }
        System.out.println(" ");
        int j = 0; // Init
        while (j < 10) {//condition
            j++; // Updation
            System.out.print(j+ " ");//prints 1 to 10 because it works like pre increment
        }
    }
}
