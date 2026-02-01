package OOPs_super_Abstraction;
public class Interface {
    public static void main(String[] args) {
car Car = new car();
Car.drive();
    }
    }
    class car implements breaks, engine {
    void drive () {
        ApplyBreak();
        GoFaster();
        StartEngine();
        engine.StopEngine();/* Static method may only be called on it's containing interface because
        Static methods do NOT belong to objects. They belong to the type (class or interface) itself.*/
    }
        public void ApplyBreak() {
            System.out.println("Apply Break");
        }
        @Override
        public void GoFaster() {
            System.out.println("Go Faster");
        }
    }
interface breaks {
 void ApplyBreak(); //abstract by default
}
interface engine {
    void GoFaster();
    default void StartEngine() { //concrete implementation requires a body
        System.out.println("Start Engine");
    } // default in interface ≠ default access modifier.
    static void StopEngine() {
        System.out.println("Stop Engine");
    }
}