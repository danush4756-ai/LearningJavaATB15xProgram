package Collection_Framework.MAP;
import java.util.*;
public class Linked_Hash_Map {
    public static void main(String[] args) {
        Map<String, String> countries = new LinkedHashMap<>();
        countries.put("IN", "India");
        countries.put("US", "United States");
        countries.put("UK", "United Kingdom");
        countries.put("JP", "Japan");
        System.out.println(countries);
    }
}
