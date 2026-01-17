package methods;

public class Creating_method {
    public static void main(String[] args) {
        //   public static int sum(int a, int b) {
        //     return a + b;
        //we cannot create method inside a method
    }
    public static int sum(int a, int b) {
        return a + b;
    }
    static void non_return_function() {
        System.out.println("Print something no return or return type");
    }
    static int return_int() {
        System.out.println("Print something no return or return type");
        return 10;
    }
    static boolean return_boolean() {
        System.out.println("Print something no return or return type");
        return true;
    }
    static float return_float_pi_value(){
        return 3.14f;
    }
}
