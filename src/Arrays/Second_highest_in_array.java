package Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Second_highest_in_array {
    public static void main(String[] args) {
        int a[] = {3, 6, 8, 9 ,1};
        Arrays.sort(a);
        System.out.println(a[a.length-2]);
     }
}
