public class Escape_sequence {
    public static void main(String[] args) {
        /* Escape sequence is a combination of characters that represents a special character or action
        in a string. It starts with a backslash \ followed by another character. */
        char new_line = '\n';
        char tab_line = '\t';//space
        char back_space = '\b';
        char carriage_return = '\r';

        System.out.println("darshan");
        System.out.println("new"+new_line+"line");
        System.out.println("new\nline");
        System.out.println("gives"+tab_line+"space"); //gives space
        System.out.println("back"+back_space+"space");
        System.out.println("darshan"+carriage_return+"TS");

        System.out.println( " \"-----\" "); //to add double quotes
        String path = "C:\\Users\\QA\\test.txt";//Backslash
        System.out.println(path); // Output: C:\Users\QA\test.txt
        System.out.println("\'darshan\'");// adds single quotes

        System.out.println("Hi, This is a First line"+new_line+"This is second line\n This is Third line");
    }
}
