package Exceptions.CF_01_LIST;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sorting_String_and_char {
    public static void main(String[] args) {
        List marks = new ArrayList();
        marks.add('1'); //Digits '0'-'9' range from 48 to 57. Value 49
        marks.add('.'); //Special characters usually come before numbers and letters.
        marks.add('7'); //Value 55
        marks.add('a'); //Lowercase letters start much higher (97-122).
        System.out.println(marks); //original
        Collections.sort(marks);
        System.out.println(marks);//ascending
        Collections.sort(marks, Collections.reverseOrder());
        System.out.println(marks);//descending
        System.out.println("-----");
        List marks1 = new ArrayList();
        marks1.add("Darshan"); //'D' (from "Darshan") has an ASCII value of 68.
        marks1.add("T S"); //'T' (from "T S") has an ASCII value of 84.
        System.out.println(marks1); //original
        Collections.sort(marks1);
        System.out.println(marks1);//ascending
        Collections.sort(marks1, Collections.reverseOrder());
        System.out.println(marks1);//descending
    }
}
