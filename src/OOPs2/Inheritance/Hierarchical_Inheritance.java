package OOPs2.Inheritance;

public class Hierarchical_Inheritance {
    public static void main(String[] args) {

        Car c = new Car();
        c.fuelType();   // inherited
        c.wheels();

        Bike b = new Bike();
        b.fuelType();   // inherited
        b.wheels();

        Truck t = new Truck();
        t.fuelType();   // inherited
        t.loadCapacity();
    }
}
    // Parent class
    class Vehicle {
        void fuelType() {
            System.out.println("Vehicle uses fuel");
        }
    }
    // Child 1
    class Car extends Vehicle {
        void wheels() {
            System.out.println("Car has 4 wheels");
        }
    }
    // Child 2
    class Bike extends Vehicle {
        void wheels() {
            System.out.println("Bike has 2 wheels");
        }
    }
    // Child 3
    class Truck extends Vehicle {
        void loadCapacity() {
            System.out.println("Truck carries heavy load");
        }
    }

