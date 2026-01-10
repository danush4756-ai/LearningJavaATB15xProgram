package Type_casting;
public class Type_casting {
    static void main(String[] args) {
        byte a =10;
        int b = a; //implicit widening
        int c = (int)b; //explicit widening is unnecessary as implicit widening is simple
        //byte d = c; implicit narrowing not allowed
        byte d = (byte)c; //explicit narrowing is allowed because it is the way of telling java,
 //i know this might lose data but I'm doing it intentionally and responsibility will be on user
 int e = 383, g = 384;
 byte f = (byte) e;//byte value ranges between -128 to 127 & total 256 values
        System.out.println(f);//383 % 256 = 127
        byte h = (byte) g;//384 % 256 = 128 & 128 - 256 = -128
        System.out.println(h);
    }
}
