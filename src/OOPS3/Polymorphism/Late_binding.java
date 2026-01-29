package OOPS3.Polymorphism;
public class Late_binding {
    public static void main(String[] args) {
        // Even without "polymorphic" intent, this uses late binding
        Animal a = new Dog();
        a.sound();  // LATE BINDING - JVM checks actual object type at runtime
        //late binding is not possible without method overriding
    }
}
    class Animal {
        void sound() {
            System.out.println("Some sound");
        }
    }

    class Dog extends Animal {
        void sound() {
            System.out.println("Bark");
        }
    }


