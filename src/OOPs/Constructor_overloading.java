package OOPs;

public class Constructor_overloading {
    public static void main(String[] args) {
        Baby b1 = new Baby();
        Baby b2 = new Baby("Pramod");
        Baby b3 = new Baby("10K");
        Baby b4 = new Baby(5);
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
    // Baby(String money){ this gives error because it is duplicate data type from previous constructor
    Baby (int age) {
        System.out.println("PC - name.age");
    }
}
