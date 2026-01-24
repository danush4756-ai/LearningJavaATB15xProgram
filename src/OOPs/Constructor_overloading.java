package OOPs;

public class Constructor_overloading {
    public static void main(String[] args) {
        Baby b1 = new Baby();
        Baby b2 = new Baby("Pramod");
        Baby b3 = new Baby("Pramod","10K");
       // System.out.println(b3.money); this is not possible we can accesses only through instance variable
    }
}
class Baby{
    String name;
    Baby(){
        System.out.println("DC");
    }
    Baby(String name){
        System.out.println("PC - name");
    }
    Baby(String name,String money){
        System.out.println("PC - name.age");
    }
}
