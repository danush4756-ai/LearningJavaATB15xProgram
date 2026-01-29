package OOPS3.Encapsulation;
public class Getter_setter {
    public static void main(String[] args) {
        vwlogin test = new vwlogin("darshan", "1200");
        test.password = "9800";
        System.out.println(test.loginid);
        limitedAccess check = new limitedAccess("ajay", "6700");
       // check.password = "8900"; cannot access this
       // System.out.println(check.loginid); private access
        check.setPassword("8900"); // works with setter
        System.out.println(check.getLoginid()); // works with getter
    }
}
 class vwlogin {
   public String loginid, password;
   vwlogin(String loginid, String password) {
       this.loginid=loginid;
       this.password=password;
   }
}
class limitedAccess {
    private String loginid;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLoginid() {
        return loginid;
    }

    public void setLoginid(String loginid) {
        this.loginid = loginid;
    }

    private String password;
    limitedAccess(String loginid, String password) {
        this.loginid=loginid;
        this.password=password;
    }
}