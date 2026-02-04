package ENUM;

public class Enum {
    public static void main(String[] args) {
        Day today = Day.wednesday;
        System.out.println(today);
        System.out.println(today.name());
        System.out.println(today.ordinal());//index
        switch (today) {
            case monday -> System.out.println("monday");
            case tuesday -> System.out.println("tuesday");
        }
    }
}
