package Switch;

import java.util.Scanner;

public class if_scanner_hasNextInt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number from 1 to 7 to tell which day: ");

        if (scanner.hasNextInt()) { /* this has to be written before asking input because if this is asked
        after asking user input, user input will already be executed and crashed if it is invalid user
        user input*/
            int day = scanner.nextInt();//instead of int if user enter string InputMismatchException error
            switch (day) {
                case 1:
                    System.out.println("Mon");
                    break;//if break is not added every condition will start executing
                case 2:
                    System.out.println("Tue");
                    break;
                case 3:
                    System.out.println("wed");
                    break;
                case 4:
                    System.out.println("thu");
                    break;
                case 5:
                    System.out.println("fri");
                    break;
                case 6:
                    System.out.println("sat");
                    break;
                case 7:
                    System.out.println("sun");
                    break;
                default:
                    System.out.println("Enter number from 1 to 7");
            }
        } else {
            System.out.println("Invalid input");
        }
        System.out.println("end of the program");
    }}
