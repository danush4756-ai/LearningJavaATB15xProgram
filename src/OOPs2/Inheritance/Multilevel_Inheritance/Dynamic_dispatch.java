package OOPs2.Inheritance.Multilevel_Inheritance;

public class Dynamic_dispatch {
    public static void main(String[] args) {
        GrandFather g1 = new Son();
        Father f2 = new Son();
        //Son s2 = new Father(); not possible
    }
}
