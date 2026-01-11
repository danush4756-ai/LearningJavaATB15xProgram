package EXAM_11th_Jan_2026_Java;

public class Q5_Positive_Negative_or_Zero {
    public static void main(String[] args) {
        String result = (78<0) ? "78 is a negative number"
                : (78>0) ? "78 is a positive number"
                : "78 is zero";
        System.out.println(result);
    }
}
