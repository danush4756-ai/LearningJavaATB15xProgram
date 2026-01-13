package methods;

public class contents_of_methods {
    public static void main(String[] args) {
    }
    public int add(int a, int b) {      // Anyone can call this
        return a + b;
    }
   /* public = access modifier (who can use it)
      int = return type (what it gives back)
      add = method name (what it's called)
      int a, int b = parameters (what it takes in) */
   /* public - Accessible from anywhere (any class, any package)
      private - Accessible only within the same class
      protected - Accessible within the same package and subclasses
      default (no keyword) - Accessible only within the same package */
    private int subtract(int a, int b) { // Only this class can call this
        return a - b;
    }

}