package OPPs_super_Abstraction;

public class Super {
    class BaseClass {
        public String getBrowser() {
            return browser;
        }
        public void setBrowser(String browser) {
            this.browser = browser;
        }
        private String browser;
        BaseClass() {
            System.out.println("DC- Parent");
        }
        BaseClass(String browser) {
            this.browser = browser;
            System.out.println("DC- Parent");
        }
        void openBrowser(String browserName) {
            System.out.println("Open Browser!! -> " + browserName);
        }
        private int aa;
        void closeBrowser() {
            System.out.println("Close Browser!!");
        }
    }
    class TestCase extends BaseClass {
        void test() {
        }
        String a;
        TestCase() {
            //super(); No-arg Explicit Constructor and (Inheritance) Implicit Call
       //super("Chrome"); Parameterized Explicit Constructor and (Inheritance) Implicit Call
            //it is possible to have one Explicit Constructor call
            super.openBrowser("Chrome");
            super.closeBrowser();
            System.out.println(super.getBrowser());
            super.setBrowser("firefox");
            this.test();//
            System.out.println(this.a);
            }
    }
}