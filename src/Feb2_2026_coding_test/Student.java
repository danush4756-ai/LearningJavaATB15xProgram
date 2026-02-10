package Feb2_2026_coding_test;

public class Student {
    // attributes
    String name;
    int rollNo;
    char section;
    // constructor
    Student(String name, int rollNo, char section) {
        this.name = name;
        this.rollNo = rollNo;
        this.section = section;
    }
    // method to print student details
    void printDetails() {
        System.out.println("Student Name : " + name);
        System.out.println("Roll Number  : " + rollNo);
        System.out.println("Section      : " + section);
        System.out.println("---------");
    }
    public static void main(String[] args) {
        Student s1 = new Student("Darshan", 191, 'A');
        Student s2 = new Student("Kiran", 182, 'B');
        s1.printDetails();
        s2.printDetails();
    }
}
