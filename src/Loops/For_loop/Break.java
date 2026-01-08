package Loops.For_loop;

public class Break {
    public static void main(String[] args) {
       for (int a = 0; a < 50; a++) {  // Time, from where to where to, 0 to 49, 50 Times
           System.out.println(a);/* each iteration of loop runs through all the statements in
            order before moving to the next iteration. so when a value is 5, it prints 5 and break is applied*/
           if (a == 5) {
                break;
            }
        }
       System.out.println("End");

            for (int i = 0; i < 50; i++) {  // Time, from where to where to, 0 to 49, 50 Times
                if (i == 5) {
                    break;
                }
                System.out.println(i);/*as the statement is after break when the value becomes
               5 the break is applied before printing 5 and so it prints only till 4*/
            }

            System.out.println("End");

        }
    }

