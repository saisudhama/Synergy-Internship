package Coding_Challenges;

public class Employee {
    
    public String name;
    public String department;
    public int salary;

    public Employee(String name, String department, int salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public String toString() {
        return "Name: " + name + ", Department: " + department + ", Salary: " + salary;
    }

}
