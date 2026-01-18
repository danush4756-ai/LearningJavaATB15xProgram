package Arrays;

public class Second_highest_in_array_using_loops {
    public static void main(String[] args) {
        int[] numbers = {12, 4, 10, 1, 100, 3, 34, 32};//100,34
        int max = numbers[0];
        int secondHighest = numbers[0];
        int thirdHighest = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                thirdHighest = secondHighest;
                secondHighest = max;
                max = numbers[i];
            }else if (numbers[i] > secondHighest && numbers[i] != max) {
                secondHighest = numbers[i];
        } else if (numbers[i]>thirdHighest && numbers[i] != secondHighest && numbers[i] != max) {
                thirdHighest = numbers[i];
            }
        }
        System.out.println("Second highest number in given array : " + secondHighest);
        System.out.println(thirdHighest);
    }
}