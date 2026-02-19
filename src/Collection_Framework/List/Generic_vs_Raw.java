package Collection_Framework.List;
import java.util.*;
public class Generic_vs_Raw {
    public static void main(String[] args) {
        //List list = new ArrayList(); Raw Type is not good practice
        List <Object> list = new ArrayList<>(); //good practice
        //List<WebElement> buttons tells the tester exactly what the list contains.
        list.add("Java");
        list.add(10);   // Mixed data
        System.out.println(list);
        for (Object m : list) {
            Integer price = (Integer) m;
            System.out.println(m);
        }
    }
}
