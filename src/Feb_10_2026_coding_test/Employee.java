package Feb_10_2026_coding_test;

public class Employee {
    //variables
    private int id;
    private String name;
    private double salary;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.setId(8300);
        emp.setName("Darshan");
        emp.setSalary(40000);
        System.out.println("Employee ID     : " + emp.getId());
        System.out.println("Employee Name   : " + emp.getName());
        System.out.println("Employee Salary : " + emp.getSalary());
}
}
