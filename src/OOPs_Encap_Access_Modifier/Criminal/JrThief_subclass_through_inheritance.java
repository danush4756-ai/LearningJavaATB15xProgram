package OOPs_Encap_Access_Modifier.Criminal;
import OOPs_Encap_Access_Modifier.Police.Cop_within_class;
public class JrThief_subclass_through_inheritance extends Cop_within_class {
    public JrThief_subclass_through_inheritance(int bullet) {
        super(bullet);
        Cop_within_class clear = new JrThief_subclass_through_inheritance(56); //public access
        super.CanIShoot(); /*If protected members are in different packages, you can only access them through
        super or a reference of the subclass type. So clear.CanIShoot; is not allowed*/
    }
}
