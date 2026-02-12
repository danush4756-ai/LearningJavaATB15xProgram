package Collection_Framework.List;
import java.util.*;
public class Linked_List {
    public static void main(String[] args) {
//        List my_list = new ArrayList();
        List mylist = new LinkedList();
        mylist.add(1);
        mylist.add(2);
        mylist.add(3);
        mylist.addLast(4);
        mylist.addFirst(5);
        System.out.println(mylist.getFirst());
        System.out.println(mylist.getLast());
        System.out.println(mylist.get(2));
        mylist.removeFirst();
        mylist.remove("Banana");
        System.out.println(mylist);
        mylist.remove(2);
        System.out.println(mylist);
        List mylist2 = new ArrayList();
        mylist2.addLast("Darshan");
        mylist2.addFirst("T S");
        System.out.println(mylist2);
    }
}
