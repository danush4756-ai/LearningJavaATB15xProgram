package increment_decrement;

public class Interview_increment_decerement {
    public static void main(String[] args) {
        int x = 5; int y = ++x;//x value becomes 6 as incremented 1st
        System.out.println(x + " " + y);
        int a = x++;
        System.out.println(x+" "+a);
        // Valid - decrementing a variable
        int z = 2;
        z--;  // ✅ Works! x becomes 1

// Invalid - decrementing a literal
       // 2--;  // ❌ ERROR! Cannot decrement a fixed value
    }
}
