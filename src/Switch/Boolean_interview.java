package Switch;

public class
Boolean_interview {
    public static void main(String[] args) {
        boolean flag = true;

// This WORKS in Java 22+:
        switch
        (flag) {  // ✅ Works now!
            case true -> System.out.println("True");
            case false -> System.out.println("False");
        }
    }
}


