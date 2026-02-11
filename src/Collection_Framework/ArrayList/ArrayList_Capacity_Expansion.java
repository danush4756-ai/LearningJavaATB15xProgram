package Collection_Framework.ArrayList;
import java.util.ArrayList;
import java.util.List;
public class ArrayList_Capacity_Expansion {
    public static void main(String[] args) {
        List check = new ArrayList();
        check.add("1");//1
        check.add("1");//2
        check.add("1");//3
        check.add("1");//4
        check.add("1");//5
        check.add("1");//6
        check.add("1");//7
        check.add("1");//8
        check.add("1");//9
        check.add("1");//10 after this if I add elements it will increase the capacity to 15 (+5)
        check.add("1");//11
        check.add("1");//12
        check.add("1");//13
        check.add("1");//14
        check.add("1");//15 after this if I add elements it will increase the capacity to 22 (+7)
        check.add("1");//16
    }
}
