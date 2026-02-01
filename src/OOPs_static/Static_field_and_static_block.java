package OOPs_static;

public class Static_field_and_static_block {
     static int a = printA(); //static field
     static {
         System.out.println("static block");
     }//static block
     static void test() {
         System.out.println("method");
     }
     static int printA() {
         System.out.println("static variable");
         return 10;
     }
     public static void main(String[] args) {
         System.out.println("main");
     }
}
