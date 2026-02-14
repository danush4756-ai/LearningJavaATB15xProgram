package Collection_Framework.List;
import java.util.*;
public class enumaration {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        System.out.println(al);
        Collections.sort(al, Collections.reverseOrder());
        for (Integer o:al){
            System.out.println(o);
        }
        Vector v = new Vector<>();
        v.add("Pramod");
        v.add("Dutta");
        v.add("Amit");
        Enumeration<String> e = v.elements();
        while (e.hasMoreElements()){
            System.out.println(e.nextElement());
        }
 }
}
