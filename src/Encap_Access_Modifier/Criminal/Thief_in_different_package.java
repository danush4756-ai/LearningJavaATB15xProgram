package Encap_Access_Modifier.Criminal;
import Encap_Access_Modifier.Police.Cop_within_class; //importing user created class
public class Thief_in_different_package {
    public static void main(String[] args) {
Cop_within_class crime = new Cop_within_class(13); // public access modifier can be assessed even from different package
/*crime.CanIShoot(); protected cannot be accessed from different package unless it is subclassed through
inheritance*/
//crime.IdCard = "Check"; private accessed outside the package
       // crime.UnderstandingDefault(); default cannot be accessed outside the package
    }
    }

