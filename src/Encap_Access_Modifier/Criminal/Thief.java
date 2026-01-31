package Encap_Access_Modifier.Criminal;
import Encap_Access_Modifier.Police.Cop; //importing user created class
public class Thief {
    public static void main(String[] args) {
Cop crime = new Cop(13); // public access modifier can be assessed even from different package
/*crime.CanIShoot(); protected cannot be accessed from different package unless it is subclassed through
inheritance*/
//crime.IdCard = "Check"; private accessed outside the package
       // crime.UnderstandingDefault(); default cannot be accessed outside the package
    }
    }

