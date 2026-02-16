package Collection_Framework.List;
import java.util.*;
public class Sorting_different_types_of_data_not_possible {
    public static void main(String[] args) {
        List marks = new ArrayList();
        marks.add("Darshan");
        marks.add(95);
        marks.add('T');
        marks.add(5.89);
        System.out.println(marks); //original
        Collections.sort(marks,(a, b) -> a.toString().compareTo(b.toString()));
        System.out.println(marks);
        Collections.sort(marks, (b, a) -> a.toString().compareTo(b.toString()));
        System.out.println(marks);
       /* Collections.sort(marks);
        System.out.println(marks);//ascending
        Collections.sort(marks, Collections.reverseOrder());
        System.out.println(marks);//descending */
    }
}
