package Variables_data_types;

public class suffixes_float {
    public static void main(String[] args) {
       // float a = 3.14;    // ❌ ERROR - 3.14 is double, can't assign to float
        float b = 3.14F;   // ✅ Works - F suffix makes it float
        float c = (float) 3.14;  // ✅ Also works (explicit casting)
        float a = 3.14f;   // ✅ Valid (commonly used)
        /* When to use F:
ALWAYS when assigning decimal values to float*/
    }
}
