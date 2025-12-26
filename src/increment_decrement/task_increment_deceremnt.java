package increment_decrement;

public class task_increment_deceremnt {
    static void main(String[] args) {
        int a = 10;
        a = a++ + a++ + a++;
        System.out.println(a);

        a = 3;

        int b = a++ * ++a;

        System.out.println(b);


        a = 5;

        System.out.println(a++ + a--);
    }
}
