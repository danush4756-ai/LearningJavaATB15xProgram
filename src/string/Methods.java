package string;

public class Methods {
    public static void main(String[] args) {
        String s1 = "ABCD";
        String s2 = new String("ABCD");
        String s3 = "abcd";
        String s4 = " ";
        String s5 = "\n";
        System.out.println(s1);
        System.out.println(s1.length());
        System.out.println(s1.toLowerCase());//new string is created
        System.out.println(s1.toUpperCase());//ABCD is already there, so it uses it
        System.out.println(s1.concat("E"));
        System.out.println(s1==s2);//false because both points towards different memory location
        System.out.println(s1.equals(s2));//true because value is same
        System.out.println(s1.equalsIgnoreCase(s3));//ignores the case so true
        System.out.println(s1.charAt(2));
        System.out.println(s1.charAt(1)+s1.charAt(2));//ASCII values of two chars are added
        System.out.println(s1.indexOf("B"));
        System.out.println(s4.isEmpty());//it will not consider Whitespace as empty
        System.out.println(s4.isBlank());//doesn't consider Whitespace
        System.out.println(s5.isBlank());//escape sequence is also considered as Whitespace
        System.out.println(s1.compareTo(s4));/*it compares the ASCII values of 1st cahrs of s1 and s2.
        here empty space also have ASCII value and even escape sequence will have ASCII value*/
        System.out.println(String.join("#", s1, s3));
        System.out.println(s1.replace('A','Z'));
        System.out.println(s1.startsWith("AB"));
    }
}
