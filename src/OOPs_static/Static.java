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
    }
    void nonStaticMethod () {
        System.out.println(nonstatic);
    }
}
