package Collection_Framework.Array_List;
import java.util.ArrayList;
import java.util.List;
public class list {
    public static void main(String[] args) {
        List fruits = List.of("orange","apple","guava","mango","watermelon");
        System.out.println(fruits);
      //  List mylist = new List(); List is abstract
        List arrayList = new ArrayList();
        arrayList.add("Pramod");
        arrayList.add(123);
        arrayList.add(true);
        System.out.println(arrayList);
    }
}
