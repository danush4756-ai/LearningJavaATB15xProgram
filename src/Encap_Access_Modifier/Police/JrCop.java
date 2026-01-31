package Encap_Access_Modifier.Police;

public class JrCop {
     /*jrcop.CanIShoot(); Executable statements must always be inside methods, constructors or
     initialization blocks - never directly at the class level.*/
    public static void main(String[] args) {
        Cop jrcop = new Cop(8); //public
        jrcop.CanIShoot();//protected
jrcop.UnderstandingDefault();//accessing default within same package
       // jrcop.IdCard = "Darshan"; private access allows access only within class
    }
}
