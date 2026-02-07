package OOPs_static;

public class Static_field_and_static_block {
     static int a = printA(); //static field
     static {
         System.out.println("static block");
     }//static block
     static void test() { //method
         System.out.println("method");
     }
     void test1() {
         System.out.println("method1");
     }
     static int printA() {
         System.out.println("static variable");
         return 10;
     }
     public static void main(String[] args) {
         System.out.println("main");
         test();
       //  test1(); Non-static method cannot be referenced from a static context
         Static_field_and_static_block check = new Static_field_and_static_block();
         check.test1();
     }
}
