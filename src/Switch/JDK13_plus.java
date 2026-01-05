package Switch;

public class JDK13_plus {
    public static void main(String[] args) {
        int day = 6;
        switch (day) {
            case 1, 2, 3, 4, 5 -> System.out.println("Weekday");
            case 6, 7 -> System.out.println("Weekend");
            //JDK13+ introduced -> and no need of beak
            //allowed multiple conditions with the same output
        }
    }
}
