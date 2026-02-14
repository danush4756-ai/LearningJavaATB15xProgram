package Collection_Framework.MAP;
import java.util.*;
public class HashMap_LinkedHashMap_TreeMap {
    public static void main(String[] args) {
        Map m1 = new HashMap();
        m1.put("name", "pramod");
        m1.put("rollno", 1);
        m1.put("phone", 987654321);
        m1.put(null,null);
        System.out.println(m1);
        Map m2 = new LinkedHashMap();
        m2.put("name","pramod");
        m2.put("rollno",1);
        m2.put("phone",987654321);
        m2.put(null,null);
        System.out.println(m2);
        Map m3 = new TreeMap();
        m3.put("name","pramod");
        m3.put("rollno",1);
        m3.put("phone",987654321);
       // m3.put(null,null); Null Pointer Exception
        System.out.println(m3);
  }
}
