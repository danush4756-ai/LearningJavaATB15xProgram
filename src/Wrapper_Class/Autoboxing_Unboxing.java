package Wrapper_Class;

public class Autoboxing_Unboxing {
    public static void main(String[] args) {
        int a= 10;
        Integer b = a;
        System.out.println(b); //  b has methods
        // Boxing - Primitive data type is converted wrapper - Automatic JVM will do it
        Integer aa = 43;
        int a1 = aa; // Unboxing
        System.out.println(a1); //  a1 lost the methods
        int i = Integer.parseInt("123");//string to int
        System.out.println(i+10);
        Integer m = Integer.parseInt("120");//string to Integer
        System.out.println(m+10);
    }
}
