package StringBuffer_Builder_StringFunctions;

public class append {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("Pramod");
        stringBuffer.append("Dutta");
        stringBuffer.append(123);
        System.out.println(stringBuffer);
    }
}
