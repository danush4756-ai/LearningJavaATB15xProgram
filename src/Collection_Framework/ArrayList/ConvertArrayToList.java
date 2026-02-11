package Collection_Framework.ArrayList;
import java.util.*;
public class ConvertArrayToList {
    public static void main(String[] args) {
        String arr[] = {"Java","Python","C#"};
        System.out.println(Arrays.stream(arr).count()); /*stream() is a static method of the Arrays utility class
        but Arrays don't have class*/
        //arr.set(2, "c++"); methods not allowed in arrays
        List<String> list = Arrays.asList(arr);
        list.set(2, "c++");
        /*list.add("Darshan"); Unsupported Operation Exception. Arrays.asList(arr) does NOT return
         a normal ArrayList. It returns a fixed-size list backed by the original array.*/
        System.out.println(arr.length); //.length is a property (field), not a method.
        System.out.println(list);
    }
}
