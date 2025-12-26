package Ternary_Operator;

public class Practice_ternary {
    static void main(String[] args) {
        int temp = 50;
                int humidity = 60;
                String wether = (temp > 30 && humidity > 70) ? "Hot and humid \n switch on AC and humidifier" :
                        (temp > 30)? "hot but dry \ntrun on AC" :
        (temp < 15) ? "cold \n turn on heater" : "pleasent weather";
        System.out.println(wether);
    }
}
