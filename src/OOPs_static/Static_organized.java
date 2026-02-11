package OOPs_static;

public class Static_organized {
    // Member variables
    int nonStaticVar = 10;          // Instance variable
    static String staticVar = "A";  // Static variable
    // Member methods
    void nonStaticMethod() {
        System.out.println("Inside Non-Static Method.");
    }
    static void staticMethod() {
        System.out.println("Inside Static Method.");
    }
    public static void main(String[] args) {
        // Create an object first to access non-static members
        Static_organized NonStatic1 = new Static_organized();
        // --- PART 1: Accessing non-static variable to assign values---
        NonStatic1.nonStaticVar = 100;//refer line 5
        // --- PART 2: Accessing non-static variable and method to print values ---
        System.out.println("Non-static Var: " + NonStatic1.nonStaticVar);//refer line 5
        NonStatic1.nonStaticMethod();//refer line 8
        // --- PART 3: Accessing static variable to assign values ---
        Static_organized.staticVar = "B";//refer line 6
        // We use the ClassName (Static_organized) to assign the value.
        // --- PART 4: Accessing static variable and method to print values ---
        System.out.println("Static Var: " + Static_organized.staticVar);//refer line 6
        Static_organized.staticMethod();//refer line 11
    }
}
