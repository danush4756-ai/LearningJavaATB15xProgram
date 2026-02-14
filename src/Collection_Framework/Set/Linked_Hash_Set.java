package Collection_Framework.Set;
import java.util.*;
public class Linked_Hash_Set {
    public static void main() {/*cannot write executable statements directly inside a class
    so main method is required*/
        Set lhs = new LinkedHashSet();
        // LinkedList mechanism to store the element,
        // order will maintain, no duplicates
        lhs.add("Dpple");
        lhs.add("apple");
        lhs.add("Orange");
        lhs.add("WaterMelon");
        lhs.add("WaterMelon");//duplicate element will not print
        lhs.add(null);
        System.out.println(lhs);
        System.out.println(lhs.isEmpty());
        System.out.println(lhs.contains("Apple"));
        System.out.println(lhs.size());
    }
}