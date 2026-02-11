package Collection_Framework;
import java.util.*;
public class Iteration {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("1"); // 0
        list.add("2"); // 1
        list.add("3");// 2
        list.add("3"); // 3
        list.add(4);
        list.add(true);
        System.out.print(list.size() + " ");
        System.out.print(list.isEmpty() + " ");
        System.out.print(list.contains("1") + " ");
        System.out.print(list.contains(1) + " ");
        System.out.print(list.indexOf("3") + " ");
        System.out.println(list.lastIndexOf("3") + " ");
        System.out.println(list + " ");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println(" ");
        for (Object o : list) {
            System.out.print(o + " ");
        }
        System.out.println(" ");
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
    }
}
