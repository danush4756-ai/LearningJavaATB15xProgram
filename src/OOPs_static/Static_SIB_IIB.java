package OOPs_static;
public class Static_SIB_IIB {
    public static void main(String[] args) {
        Static_SIB_IIB call = new Static_SIB_IIB();
    }
    static {//SIB
        System.out.println("static initialization block");
    }
    { //IIB
        System.out.println("Instance Initialization Block");
    }
}
