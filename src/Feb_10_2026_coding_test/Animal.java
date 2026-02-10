package Feb_10_2026_coding_test;
// Parent class
public class Animal {
        // method to be overridden
        void makeSound() {
            System.out.println("Animal makes a sound");
        }
    }
    // Child class Dog
    class Dog extends Animal {
        @Override
        void makeSound() {
            System.out.println("Dog barks");
        }
    }
    // Child class Cat
    class Cat extends Animal {
        @Override
        void makeSound() {
            System.out.println("Cat meows");
        }
        public static void main(String[] args) {
            Animal a1 = new Dog();
            Animal a2 = new Cat();
            a1.makeSound();
            a2.makeSound();
        }
    }


