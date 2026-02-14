package Collection_Framework.MAP;
import java.util.*;
public class Tree_map {
    public static void main() {
    Map<String, Integer> prices = new TreeMap<>();
        prices.put("Banana", 40);
        prices.put("Apple", 120);
        prices.put("Cherry", 200);
        prices.put("Date", 350);
    // {Apple=120, Banana=40, Cherry=200, Date=350}
    // ✅ Sorted alphabetically by key!
        System.out.println(prices);
}
}
