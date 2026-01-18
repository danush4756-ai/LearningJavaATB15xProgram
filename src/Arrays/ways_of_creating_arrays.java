package Arrays;

import Operators.Char;

public class ways_of_creating_arrays {
    public static void main(String[] args) {
        int [] marks = {98, 67,98};
        int weight [] = {45, 89, 78};
        String [] studends = new String[3];
        studends [0] = "Darshan";
        studends [1] = "Abhi";
        studends [2] = "Nirmal";
      //  studends [3] = "Kiran"; error out of bounds at runtime
        boolean [] married = {true,false,true};
        for (String MBA: studends) {
            System.out.println(MBA);
        }
    }
}
