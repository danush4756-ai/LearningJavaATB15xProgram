package Collection_Framework.MAP;
import java.util.*;
public class Hash_Table {
    public static void main(String[] args) {
        // Map -  null values allows
        // Hashtable Synchronised, Slow and Legacy Class - Thread Safe
        Hashtable<Integer,String> ht1 = new Hashtable();
        ht1.put(1, "one");
        ht1.put(2, "two");
        ht1.put(3, "three");
        //ht1.put(4, null); null point exception
        //ht1.put(null, "three");
        Map<Integer,String> ht2 = new HashMap<>();
        ht2.put(1, "one");
        ht2.put(2, "two");
        ht2.put(3, "three");
        ht2.put(4, null);
        ht2.put(null, "three");
    }
}
