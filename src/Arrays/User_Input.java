package Arrays;
import java.util.Scanner;
public class User_Input {
    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the arraySize: ");
int arraySize = scanner.nextInt();
int players_score [] = new int[arraySize];
for (int i=0; i<arraySize;i++){
    System.out.print("Enter the score: ");
    players_score[i] = scanner.nextInt();
}
        System.out.println("= ".repeat(10));
for (int a:players_score) {
    System.out.println(a);
}
        System.out.println("= ".repeat(10));
for (int b=0; b<players_score.length; b++){
    System.out.println(players_score[b]);
}
    }
}
