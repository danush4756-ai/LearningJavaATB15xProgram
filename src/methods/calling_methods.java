package methods;

public class calling_methods {
    public class Example { //✅ Classes inside classes: ALLOWED in Java
        public static void functionA() {
            System.out.println("Function A");
            functionB();  // Calling another function
        }
        public static void functionB() {
            System.out.println("Function B");
            functionA();  // Can even call functionA back (be careful - infinite loop!)
        }
        public static void main(String[] args) {
            functionA();  // Calling from main
        }
    }
}
