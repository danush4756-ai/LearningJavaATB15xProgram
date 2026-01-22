package OOPs;

public class using_class_in_another_class {
    public static void main(String[] args) {
        classes p1 = new classes();
        p1.name = "darshan";
        classes p2 = new classes();
        p2.name = "darshan";
        classes p3;
        new classes(); //this is also an object but don't have reference
    }
}