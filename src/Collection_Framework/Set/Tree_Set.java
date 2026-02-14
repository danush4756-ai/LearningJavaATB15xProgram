package Collection_Framework.Set;
import java.util.*;
public class Tree_Set {
    public static void main() {
        Set ts = new TreeSet();
        // Black and Red Tree mechanism to store the element.
        // Natural Sorting order is maintained.
        ts.add("Dapple");
        ts.add("Apple");
        ts.add("Orange");
        ts.add("WaterMelon");
        ts.add("WaterMelon");
        //ts.add(123); not allowed because it effects sorting
        //ts.add(null); not allowed because it effects sorting
        System.out.println(ts);
        Iterator iterator = ts.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
   }
}
