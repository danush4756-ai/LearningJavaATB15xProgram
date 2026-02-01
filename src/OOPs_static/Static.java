package OOPs_static;
public class Static {
    Static (){
        System.out.println("hello");
    }
    int nonstatic = 10;
    static String STATIC = "Darshan";
    static {
        System.out.println("Static Block"); //static block
    }
    public static void main(String[] args) {
        int a = 10;
        Static check = new Static();
        System.out.println(check.nonstatic); //uses Object Access
        check.nonStaticMethod(); //calls an instance method through the object reference.
        Static.STATIC = "Static Variable"; //static variable
        System.out.println(STATIC);
        Static.StaticMethod(); //static method
      //System.out.println(nonstatic); Non-static field cannot be referenced from a static context
    }
    void nonStaticMethod () {
        System.out.println(nonstatic);
    }
    static void StaticMethod () {
        System.out.println("Static method");
    }
}
