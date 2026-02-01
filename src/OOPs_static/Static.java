package OOPs_static;
public class Static {
    Static (){
        System.out.println("hello");
    }
    int nonstatic = 10;
    static String STATIC = "Darshan";
    static {
        System.out.println("hello");
    }
    public static void main(String[] args) {
        int a = 10;
        Static check = new Static();
        System.out.println(check.nonstatic);
        check.nonStaticMethod();
      //System.out.println(nonstatic); Non-static field cannot be referenced from a static context
        System.out.println(STATIC);
        /* Final Statement:-
Inside a static method like main, non-static members must be accessed using an object, while static
members can be accessed directly using the class */
    }
    void nonStaticMethod () {
        System.out.println(nonstatic);
    }
}
