package OOPs.Constructor;

public class Constructor_chaining {
    public class LoginPage {
        String email;
        int a;
        LoginPage() {
            System.out.println("DC");
        }
        public LoginPage(String email, String password) {
            this.email = email;
            this.password = password;
        }
        String password;
        public LoginPage(String email, String password, String submitButton, int a) {
            //this.email = email;
            //this.password = password;
            this(email, password); //constructor chaining
            this.submitButton = submitButton;
            this.a = a;
        }
        String submitButton;
    }
}