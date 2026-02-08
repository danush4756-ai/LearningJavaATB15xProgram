package Exceptions.CF_01_LIST;
import java.util.*;
public class Nested_ArrayList {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList();
        fruits.add("orange");
        fruits.add("apple");
        fruits.add("cherry");
//        fruits.add(133);
        System.out.println(fruits);
        List vegatables = new ArrayList();
        vegatables.add("tamato");
        vegatables.add("patato");
        vegatables.add("onion");
        System.out.println(vegatables);
        List all_fruits_veg = new ArrayList();
        all_fruits_veg.add(fruits);
        all_fruits_veg.add(vegatables);
        System.out.println(all_fruits_veg);
        System.out.println(all_fruits_veg.size());
        System.out.println(all_fruits_veg.get(1));
  }
}
