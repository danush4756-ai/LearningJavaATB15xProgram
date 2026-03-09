package OOPs_static;
public class Static_Vs_NonStatic {
    Static_Vs_NonStatic(){
        System.out.println("hello");
    }
    int nonstatic = 10;
    static String STATIC = "Darshan";
    static {
        System.out.println("Static Block"); //static block
    }
    public static void main(String[] args) {
        int a = 10;
        Static_Vs_NonStatic check = new Static_Vs_NonStatic();
        System.out.println(check.nonstatic); //non-static variable
        check.nonStaticMethod(); //non-static method
        Static_Vs_NonStatic.STATIC = "Static Variable"; //static variable
        System.out.println(STATIC);
        Static_Vs_NonStatic.StaticMethod(); //static method
      //System.out.println(nonstatic); Non-static field cannot be referenced from a static context
    }
    void nonStaticMethod () {
        System.out.println(nonstatic);
    }
    static void StaticMethod () {
        System.out.println("Static method");
    }
}
