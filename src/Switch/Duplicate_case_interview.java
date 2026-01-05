package Switch;

public class Duplicate_case_interview {
    public static void main(String[] args) {
        int a = 98;
        switch (a) {
            case 98:
                System.out.println("98");
//            case 98: //duplicate case is not allowed
//                System.out.println("98");
        }
    }
}
