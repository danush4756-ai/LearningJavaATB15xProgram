package Encap_Access_Modifier.Police;

public class Cop {
    private String IdCard = "1st cop";
    private int gun;
    public static void main() {
       /* private String IdCard; ❌ ERROR: private not allowed inside a method. Access Modifiers
        cannot be used for Local variables*/
        Cop WithinClass = new Cop(100);
        WithinClass.IdCard = "1st cop"; //private access within class
        WithinClass.gun = 56; //public access within class
        WithinClass.CanIShoot();//protected access within class
        WithinClass.UnderstandingDefault();//Default (no modifier) access within class
    }
        public Cop(int bullet) {
        this.gun = bullet;
        }
        protected void CanIShoot () {
        System.out.println("yes, you can");
        }
        void UnderstandingDefault (){
            System.out.println("Hi, cop");
        }
    }

