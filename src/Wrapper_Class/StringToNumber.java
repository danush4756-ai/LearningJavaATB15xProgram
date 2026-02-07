package Wrapper_Class;

public class StringToNumber {
    public static void main() {
        String num = "10";
        System.out.println(num+10);
        // String -> Wrapper Conversion
        Integer a = Integer.parseInt(num);
        System.out.println(a+10);
        // Double.parseDouble()
        // Float.parseFloat()
        num = "20";
        // String to Primitive
        int a_p = Integer.parseInt(num);
        System.out.println(a_p+10);
        Integer aa3 = Integer.valueOf("15");
        //int a4 = int.valueOf("30"); .class expected
        System.out.println(aa3+10);
    }
}
