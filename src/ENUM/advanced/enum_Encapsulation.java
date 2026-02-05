package ENUM.advanced;
public class enum_Encapsulation {
    public static void main(String[] args) {
        System.out.println(Hexa_codes.GREEN.getHexaCodes()); /*the required value will be printed because of
        return hexaCodes; in line 19*/
    }
}
enum Hexa_codes {
    RED("#FF0000"),
    GREEN("#61FF33"),
    BLUE("#3377FF"),
    YELLOW("#4477FF");
    private String hexaCodes;
    Hexa_codes (String hexaCodes) {
        this.hexaCodes = hexaCodes;
    }
public String getHexaCodes() {
    return hexaCodes;
    /*In Java Enums, a setter is not required—and is actually discouraged—because Enums are designed to
    represent constants that should never change while the program is running.*/
}
}