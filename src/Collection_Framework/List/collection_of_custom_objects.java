package Collection_Framework.List;
import java.util.*;
   public class collection_of_custom_objects {
    public static void main(String[] args) {
        Employee e1 = new Employee(3, "Amit");
        Employee e2 = new Employee(1, "Pramod");
        Employee e3 = new Employee(5, "Dutta");
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(e1);
        employeeList.add(e2);
        employeeList.add(e3);
        System.out.println(employeeList);
    }
}
class Employee {
    Integer id;
    String name;
    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }
    /*When printing a collection of custom objects, we must override the toString() method; otherwise,
    the default Object class implementation prints the class name and hash code.*/
    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}