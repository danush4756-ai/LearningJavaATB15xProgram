package Variables_data_types;

public class suffixes_long {
    public static void main(String[] args) {
        long x = 100;           // ✅ Works - 100 fits in int range
        long y = 2147483647;    // ✅ Works - max int value
        //long z = 2147483648;    // ❌ ERROR - exceeds int range
        long z = 2147483648L;// ✅ Works - L suffix makes it long
        long m = 314134l; // ✅ Valid but CONFUSING (looks like 1001)
       // long n = (long) 2147483648; // ❌ STILL ERROR!
        /* When to use L:
When the value exceeds int range (-2,147,483,648 to 2,147,483,647) */
    }
}
