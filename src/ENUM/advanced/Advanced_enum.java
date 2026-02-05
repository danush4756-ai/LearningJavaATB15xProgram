package ENUM.advanced;

public class Advanced_enum {
    public static void main(String[] args) {
        System.out.println(ENV.QA.baseURL);
        // Here I can write the QA code
        if (ENV.QA.baseURL.equals("https://qa.myapp.com")) {
            System.out.println("Start on QA!!");
        }
    }
    //public enum ENV { we can have only one top-level public class.
    enum ENV {
        DEV("https://dev.myapp.com"),
        QA("https://qa.myapp.com"),
        STAGING("https://staging.myapp.com"),
        PREPROD("https://preprod.myapp.com"),
        UAT("https://uat.myapp.com"),
        PROD("https://myapp.com");
        public String baseURL;
        ENV(String baseUrl) {
            this.baseURL = baseUrl;
        }
    }
}

