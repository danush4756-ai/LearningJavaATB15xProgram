package StringBuffer_Builder_StringFunctions;

public class reverse {
    public static void main(String[] args) {
       // StringBuilder s1 = "Darshan"; error because StringBuilder and StringBuffer can store only in HEAP
        StringBuilder s1 = new StringBuilder("Darshan");
        s1.reverse();
        System.out.println(s1);
        s1.toString();//converts to String and still stored in heap
    }
}
