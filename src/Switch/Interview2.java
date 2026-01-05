package Switch;

public class Interview2 {
    public static void main(String[] args) {
        char code = 'C';
        switch (code){
            default:
                System.out.println("Hellooooooo");
                //no break
            case 'A':
                System.out.println("65");
                break;
            case 'B':
                System.out.println("66");
                break;
        }
    }
}
