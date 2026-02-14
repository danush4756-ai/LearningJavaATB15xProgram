package Collection_Framework.Set;
import java.util.*;
public class hash_set_duplicate {
    public static void main(String[] args) {
        Set hs = new HashSet();
        hs.add("Darshan"); // da67sd7a6sdad68as67da8d67
        hs.add("Darshan"); // da67sd7a6sdad68as67da8d67 //only one element will print
        hs.add("dramod"); // wewewa67sd7a668as67da8d67
        System.out.println(hs);
        List a = new ArrayList<>();
        a.add("Darshan");
        a.add("Darshan"); // duplicate is allowed
        a.add("dramod");
        System.out.println(a);
        List a1 = new LinkedList();
        a1.add("Darshan");
        a1.add("Darshan"); // duplicate is allowed
        a1.add("dramod");
        System.out.println(a1);
    }
}
