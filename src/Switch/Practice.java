package Switch;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String weather = scanner.nextLine();
        weather = weather.toLowerCase();
        switch (weather) {
            default -> System.out.println("give correct input");//default can be anywhere
            case "rainy" -> System.out.println("wear rain coat");
            case "winter" -> System.out.println("wear sweeter");
            case "summer" -> System.out.println("use AC");
        }
    }
}
