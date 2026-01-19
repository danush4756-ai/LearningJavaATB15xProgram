package Arrays;

public class Array_2D_Iterate_For_Loop {
    public static void main(String[] args) {
        int[][] a = {{1},{4,5,6},{7,8}} ;/*1st [] = rows (outer array) and rows can have different lengths
         and 2nd [] = elements/columns (inner array) */
        for (int i = 0; i<a.length; i++) {//a.length = number of rows (the outer array length)
            for (int j=0; j<a[i].length; j++) {//a[i].length = number of elements in row i
                System.out.print(a[i][j]+"|");
            }
            System.out.println("");
        }
    }
}
