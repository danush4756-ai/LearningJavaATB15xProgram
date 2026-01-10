package Loops.While_loop;
import java.util.Random;
import java.util.Scanner;
public class while_guessing_game {
    public static void main(String[] args) {

        // Guess a number from 1 to 100
        // n = 56
        // 90 , number < , 50, numner > , 55,  - 56 - times= 9

        Random random  = new Random();
        int numberToGuess = random.nextInt(100);
//        System.out.println(numberToGuess);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int guess;
        int attempts = 0;

        while(true){

            if (!scanner.hasNextInt()) {
                System.out.println("Invalid input! Please enter interger number only!");
                scanner.next(); // Consume invalid token
            }
            guess = scanner.nextInt();
            attempts++;
            if(guess < numberToGuess){
                System.out.println("more than " + guess);
            }else if( guess > numberToGuess){
                System.out.println("less than " + guess);
            }else{
                System.out.println("Correct! You have taken -> " +  attempts );
                break;
            }
        }
    }
}
