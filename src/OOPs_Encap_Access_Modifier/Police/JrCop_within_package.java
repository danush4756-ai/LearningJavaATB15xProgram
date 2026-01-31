package OOPs_Encap_Access_Modifier.Police;

public class JrCop_within_package {
     /*jrcop.CanIShoot(); Executable statements must always be inside methods, constructors or
     initialization blocks - never directly at the class level.*/
    public static void main(String[] args) {
        Cop_within_class jrcop = new Cop_within_class(8); //public
        jrcop.CanIShoot();//protected
jrcop.UnderstandingDefault();//accessing default within same package
       // jrcop.IdCard = "Darshan"; private access allows access only within class
    }
}
