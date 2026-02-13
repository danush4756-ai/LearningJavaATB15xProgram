package Collection_Framework.List;
import java.util.*;
public class STACK {
        public static void main(String[] args) {
            Stack s1 = new Stack();
            //  List In and First Out
            Stack s = new Stack();
            s.add("Pramod");
            s.add("Dutta");
            s.add("Amit");
            System.out.println("1:" + s);
            System.out.println("2:" + s.size());
            System.out.println("3:" + s.peek());
            System.out.println("4:" + s);
            System.out.println("5:" + s.pop()); //remove
            System.out.println("6:" + s);
            System.out.println("7:" + s.add("Snehal"));
            System.out.println("8:" + s);
            s.add("Chetan");
            s.add("Chetan");
            s.push("Vijay");
            System.out.println("9:" + s);
            // s.pop(3)
            s.add(2, "Lucky");
            System.out.println("10:" + s);
            s.push("Darshan");
            s.addLast("JAGMEET");
            System.out.println("11:" + s);
        }
    }
