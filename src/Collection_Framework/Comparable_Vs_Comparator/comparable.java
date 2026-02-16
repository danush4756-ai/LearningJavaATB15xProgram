package Collection_Framework.Comparable_Vs_Comparator;
import java.util.*;
public class comparable {
    public static void main(String[] args) {
        Employee e1 = new Employee(3, "Amit");
        Employee e2 = new Employee(1, "Pramod");
        Employee e3 = new Employee(5, "Dutta");
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(e1);
        employeeList.add(e2);
        employeeList.add(e3);
        System.out.println(employeeList);
        /*System.out.println(e1.id); has private access and there will be no error if private is removed in
        line 17*/
        Collections.sort(employeeList);
        System.out.println(employeeList);
    }
}
class Employee implements Comparable<Employee> {
    private Integer id;
    private String name;
    /*In the current code, making members private does not affect functionality since they are accessed only
    within the class. However, it ensures future protection by preventing external classes from directly
    modifying the internal state of the object.*/
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
    @Override
    public int compareTo(Employee o) {
        //return this.id-o.id; 'this.id - o.id' means Compare current object's id with other object's id
        return this.name.compareTo(o.name);
    }
}
