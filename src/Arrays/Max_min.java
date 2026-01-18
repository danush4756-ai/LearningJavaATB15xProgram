package Arrays;

import java.util.Arrays;

public class Max_min {
    public static void main(String[] args) {
        char [] s = {'a', 'c', 'b'};
        int d [] = {2,45,7};
        Arrays.sort(s);
        System.out.println(s[s.length-1]);
        int max = d[0];
        for (int i=0; i<d.length;i++) {
            if (d[i]>max) {
                max = d[i];
            }
        }
        System.out.println(max);
    }
}
