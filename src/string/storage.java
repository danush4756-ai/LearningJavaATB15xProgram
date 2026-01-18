package string;

public class storage {
    public static void main(String[] args) {
        String s1 = "pramod"; // SCP -> string constant pool
        String s2 = new String("pramod"); // OA - Object area
        System.out.println(s1==s2);//false because of difference in memory storage
        String s3 = "pramod";//both s1 and s2 shares "pramod" saving the space
        System.out.println(s1==s3);
        String s4 = new String("pramod");//it is not same as s2, it has created a new object
        System.out.println(s2==s4);//different objects at different memory locations, so false
    }
}
