package Collection_Framework.List;
import java.util.*;
public class UserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String continueInput = "Y";
        List<String> names = new ArrayList<>();
        while(continueInput.equalsIgnoreCase("Y")){
            System.out.println("Enter the name that you want to store");
            String name = scanner.nextLine();
            names.add(name);
            System.out.println("Do you want to add another one? Y/N");
            continueInput = scanner.nextLine();
        }
        for (String name: names){
            System.out.println(name);
        }
        scanner.close();
        //LinkedList l = new LinkedList();
    }
}
