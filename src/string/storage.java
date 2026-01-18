package string;

public class storage {
    public static void main(String[] args) {
        String s1 = "Darshan"; // SCP -> string constant pool
        String s2 = new String("Darshan"); // OA - Object area
        System.out.println(s1==s2);//false because of difference in memory storage
        String s3 = "Darshan";//both s1 and s2 shares "Darshan" saving the space
        System.out.println(s1==s3);
        String s4 = new String("Darshan");//it is not same as s2, it has created a new object
        System.out.println(s2==s4);//different objects at different memory locations, so false
        s1 = s1.concat(" T S");
        System.out.println(s1);/*"Darshan T S" is printed but "Darshan" alone is still present in String
        content pool because String is immutable*/
    }
}
