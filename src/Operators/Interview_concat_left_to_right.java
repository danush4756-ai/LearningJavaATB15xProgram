package Operators;

public class Interview_concat_left_to_right {
    static void main(String[] args) {
        String first_name = "Pramod";
        String last_name = "Dutta";

        int a = 10;
        int b = 10;
        System.out.println(first_name + last_name + a + b);
  System.out.println(a + b + first_name + last_name);

        System.out.println(first_name + last_name + (a + b));

        //         // BODMAS - Bracket of Div, mul, add, sub

        // First of all, whenever it sees strings,
        // it will do concatenation, and for the next
        // one also it will also do concatenation.
        // But when it sees integers first, it will do mathematical operation.
        // The second time it will see strings,
        // then it will do concatenation as well.

    }
}
