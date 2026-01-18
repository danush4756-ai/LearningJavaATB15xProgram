package Arrays;

public class Regular_for_loop {
    public static void main(String[] args) {
        int cap[] = {12, 23, 55};
        System.out.println(cap.length);
        System.out.println("=".repeat(5));
        for (int i=0; i< cap.length; i++) {
            System.out.println(cap[i]);
        }
    }
}
