package Literals;

public class Binary_Literals {
    public static void main(String[] args) {
        int binary = 0b1010;
        binary = 0B0110; //0b or 0B tells that value is in binary
        // binary = 0b45; //illegal digit in a binary literal
        System.out.println(binary); //this converts the binary to number
        int a = 0b1010;
        int b = --a;
        System.out.println(b); //converted binary to numerical value 10 and applied decrement and gave 9
    }
}
