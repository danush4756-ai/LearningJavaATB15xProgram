package Collection_Framework.ArrayList;
import java.util.*;
public class Setting_Initial_Size {
    public static void main(String[] args) {
        // List s = new List()
        List mylist0 = new ArrayList();
        List mylist1 = new ArrayList(5);
        mylist1.add(2131);//1
        mylist1.add(2131);//2
        mylist1.add(2131);//3
        mylist1.add(2131);//4
        mylist1.add(2131);//5
        mylist1.add(2131);//6 at 6th add, capacity becomes 7
        mylist1.add(2131);//7
        mylist1.add(2131);//8 capacity becomes 11
        mylist1.add(2131);//9
        mylist1.add(2131);//10
        mylist1.add(2131);//11
        System.out.println(mylist1);
    }
}
