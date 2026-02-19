package Collection_Framework.List;
import java.util.*;
public class Linked_List {
    public static void main(String[] args) {
//        List my_list = new ArrayList();
        List<Integer> mylist = new LinkedList<>();
        mylist.add(1);
        mylist.add(2);
        mylist.add(3);
        mylist.addLast(4);
        mylist.addFirst(5);
        System.out.println("1 " + mylist.getFirst());
        System.out.println("2 "+mylist.getLast());
        System.out.println("3 "+mylist.get(2));
        mylist.removeFirst();
       // mylist.remove(2); here 2 is considered as index
        mylist.remove(Integer.valueOf(2)); // This removes the OBJECT 2, not the INDEX 2
        System.out.println("4 "+mylist);
        mylist.remove(2);
        System.out.println("5 "+mylist);
        System.out.println("--------");
        List<String> mylist2 = new ArrayList<>();
        mylist2.addLast("Darshan");
        mylist2.addFirst("T S");
        System.out.println("6 "+mylist2);
    }
}
