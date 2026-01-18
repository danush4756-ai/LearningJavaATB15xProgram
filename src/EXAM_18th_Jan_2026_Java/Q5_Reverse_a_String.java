package EXAM_18th_Jan_2026_Java;

public class Q5_Reverse_a_String {
    public static void main(String[] args) {
        String s1 = "Darshan";
        String reverse = "";
        for (int i=s1.length()-1; i>=0; i--){
            reverse = reverse+s1.charAt(i);
        }
        System.out.println(reverse);
    }
}
