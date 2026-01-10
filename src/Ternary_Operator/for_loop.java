package Ternary_Operator;

public class for_loop {
    public static void main(String[] args) {
        for (int i = 0; i<=100;i++){
            String result = (i % 3 == 0 && i%5==0) ? "FizzBuzz"
                    : (i%5==0) ? "Buzz"
                    : (i % 3 == 0)? "Fizz"
                    : String.valueOf(i);
            System.out.println(result);
        }
    }
}
