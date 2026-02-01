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
        @Override
        public void ApplyBreak() { //here line 27 and 24 have same method and so it is overridden only once
        }
        @Override
        public void GoFaster() {
        }
    }
interface breaks {
 void ApplyBreak(); //abstract by default
}
interface engine {
    void ApplyBreak();
    void GoFaster();
    default void StartEngine() { //concrete implementation requires a body
        System.out.println("Start Engine");
    } // default in interface ≠ default access modifier.
    static void StopEngine() {
        System.out.println("Stop Engine");
    }
}