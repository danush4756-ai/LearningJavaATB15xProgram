package Collection_Framework;
import java.util.ArrayList;
import java.util.Arrays;
public class Array_vs_ArrayList {
    static void main() {
        Integer[] a = new Integer[3];
        a[0] = 12;
        a[1] = 112;
        a[2] = 123;
        System.out.println(a); //Java will print the memory address
        System.out.println(Arrays.toString(a));
        for (Integer i : a) {
            System.out.print(i + " ");
        }
        ArrayList a1 = new ArrayList();
        a1.add(23);
        a1.add(34); //
        System.out.println("\n" + a1); //it will automatically do a1.toString
        System.out.println(a1.toString());
    }
}