package OOPs_super_Abstraction;
public class Abstraction {
    public static void main(String[] args) {
        Son s1  = new Son();
        s1.loan50K();
        s1.load10K();
    }
}
abstract class Father{
    String name;
    Father () {
       /* Father name = new Father(); cannot create an object of an abstract class directly using
         the new keyword*/
    }
    abstract void loan50K();
    // concrete - complete method
    void load10K(){
        System.out.println("Given!");
    }
}
class Son extends Father{
    @Override //even if this line is removed the Override will still happen
    void loan50K() { //overriding is compulsory to make this complete
        System.out.println("Given by Son!");
    }
}
