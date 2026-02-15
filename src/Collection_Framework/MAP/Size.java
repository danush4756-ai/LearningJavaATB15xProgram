package Collection_Framework.MAP;
import java.lang.reflect.Field;
import java.util.*;
public class Size {
    public static void main(String[] args) {
        // Urls - stage, dev, qa, preprod, prod.
        Map<String,String> env_config = new HashMap<>();
        env_config.put("production", "https://prod.api.com");
        env_config.put("staging", "https://staging.api.com");
        env_config.put("dev", "https://dev.api.com");
        env_config.put("preprod", "https://preprod.api.com");
        env_config.put("uat", "https://uat.api.com");
        // Managing user credentials
        Map<String, String> credentials = new HashMap<>();
        credentials.put("admin", "admin123");
        credentials.put("user", "user123");
        credentials.put("user", null);
        credentials.put("user2", null);
        // Sending the data from Map to JSON, JSON TO MAP - API Automation
        // Web Selenium - Store the Webelements with keys.
        Map<String,String> map = new HashMap(10);
        // initialCapacity -> 10
        // Load Factor * initialCapacity = threshold //0.75*10=7.5
        // When size exceeds threshold, HashMap resizes and doubles its capacity (newCapacity = oldCapacity × 2)
        Map<Float,Double> env_config2 = new HashMap<>();
    }
}
