package OOPS3_Polymorphism;

    class Student {
        String name;
        int age;

        // Constructor
        Student(String name, int age) {
            this.name = name;
            this.age = age;
        }

        // Regular method
        void display() {
            System.out.println(name + " is " + age + " years old");
        }

        // Static method
        static void info() {
            System.out.println("This is a Student class");
        }
    }

public class Early_binding {
        public static void main(String[] args) {
            Student s = new Student("John", 20);  // EARLY BINDING (constructor call)
            s.display();                          // EARLY BINDING (method call)
            Student.info();                       // EARLY BINDING (static method)

            System.out.println(s.name);           // EARLY BINDING (variable access)
        }
    }

