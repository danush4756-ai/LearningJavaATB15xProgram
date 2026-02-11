package Collection_Framework;
import java.util.ArrayList;
import java.util.List;
public class ArrayProblem {
    public static void main(String[] args) {
        Integer[] arr = new Integer[3];
        arr[0]= 1;
        arr[1]= 1;
        //arr[2]= 'x'; Homogeneous Data Only
        //No Dynamic Memory Allocation
        //No Ready Sorting
        for (Integer i : arr) {
            System.out.print(i + " ");
        }
        //arr[2]= 3; out of bound (Fixed Size)
        //System.out.println(arr.size()); no methods
        //insertion and deletion is heavy operation.
        List arrayList = new ArrayList();
    }
}
