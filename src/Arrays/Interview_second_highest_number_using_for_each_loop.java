package Arrays;

public class Interview_second_highest_number_using_for_each_loop {
    public static void main(String[] args) {
        int[] numbers = {12, 4, 10, 1, 100, 3, 34, 32};//100,34
        int max = numbers[0];
        int secondHighest = numbers[0];
        for (int i: numbers) {
            if (i > max) {
                secondHighest = max;
                max = i;
            }else if (i > secondHighest && i != max) {
                secondHighest = i;
            }
        }
        System.out.println("Second highest number in given array : " + secondHighest);
    }
}
