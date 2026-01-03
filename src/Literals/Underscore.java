package Literals;

public class Underscore {
    public static void main(String[] args) {
        int population = 1000000000;  // Without underscore - hard to read
// With underscore - easier to read
         population = 1_000_000_000;  // Same value: 1 billion
// Java treats both as exactly the same number
        //cannot be used at the beginning or end
       // int num = _1000;      // ❌ ERROR
      //  int num = 1000_;      // ❌ ERROR
       //cannot be used next to decimal point
        // double num = 3._14;   // ❌ ERROR
        //double num = 3_.14;   // ❌ ERROR
        //cannot be used next to prefix (0b, 0x) and even before suffix
        //int binary = 0b_1010;  // ❌ ERROR
      //  long num = 1000_L;     // ❌ ERROR
    }
}
