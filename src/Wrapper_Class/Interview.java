package Wrapper_Class;
public class Interview {
    public static void main(String[] args) {
        Integer a = 127;
        Integer b = 127;
        System.out.println(a == b);       // true (cached). It reuses a cached one
        Integer c = 128;
        Integer d = 128;
        System.out.println(c == d);    // false! (not cached). Java creates two different objects
        System.out.println(c.equals(d));
        ///Cache: Store something in a quick-access place so it can be reused later instead of creating it again.
        /* Java caches Integer values from -128 to 127, so == works for small numbers but fails for larger ones.
         Always use .equals() for wrapper comparisons.*/
       //Integer num = null;
       //int value = num;  // NullPointerException!
        //System.out.println(value);
        Integer aaa = 10;
        System.out.println(aaa.toString());
        System.out.println(aaa.toString() instanceof String);
        int m = 130;
        Integer n = 130;
        System.out.println(m == n); //Integer is auto-unboxed → value comparison is done so prints true
    }
}
