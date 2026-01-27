package EXAM_18th_Jan_2026_Java;
import java.util.Scanner;
public class Q1_Count_Characters_in_a_String {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter a word: ");
        String word = scanner.nextLine();
        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) != ' ') {  // Ignore spaces
                count++;
            }
        }
            System.out.println("Number of letters: " + count);
        }
    }
