package Coding_Challenges;

import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
// import java.util.stream.Collector;
// import java.util.stream.Stream;
import java.util.stream.Collectors;

public class Task_4 {
    public static void main(String[] args) {
    
        List<Employee> employees = List.of(
            new Employee("John", "IT", 100000),
            new Employee("Mary", "HR", 90000),
            new Employee("Bob", "IT", 80000),
            new Employee("Alice", "HR", 70000),
            new Employee("Peter", "IT", 60000),
            new Employee("John", "HR", 50000),
            new Employee("Bob", "IT", 40000),
            new Employee("Alice", "HR", 30000),
            new Employee("Peter", "IT", 20000),
            new Employee("John", "HR", 10000)
        );

        List<Student> students = List.of(
            new Student("John", 10, 100),
            new Student("Mary", 9, 90),
            new Student("Bob", 8, 80),
            new Student("Alice", 8, 70),
            new Student("Peter", 10, 60),
            new Student("John", 5, 50),
            new Student("Bob", 10, 40),
            new Student("Alice", 10, 40),
            new Student("Peter", 7, 20),
            new Student("John", 9, 10)
        );

        students.stream().filter(s -> s.marks > 50).forEach(System.out::println);

        int TotalMarks = students.stream().mapToInt(s -> s.marks).sum();
        System.out.println("Total Marks: " + TotalMarks);
        System.out.println(students.stream().mapToInt(s -> s.marks).sum());

        Map<String, IntSummaryStatistics> mp = students.stream().collect(Collectors.groupingBy(Student::getName,Collectors.summarizingInt(Student::getMarks)));
        System.out.println(mp);
        System.out.println(students.stream().collect(Collectors.summarizingInt(Student::getMarks)));
        // employees.stream().flatMap(e -> Stream.of(e.department)).sorted().forEach(System.out::println);
        // employees.stream().map(e -> e.department).sorted().forEach(System.out::println);
        employees.stream().sorted((e1, e2) -> e1.department.compareTo(e2.department)).forEach(System.out::println);

        int TotalSalary = employees.stream().mapToInt(e -> e.salary).sum();
        System.out.println("Total Salary: " + TotalSalary);

        int TotalSalaryIT = employees.stream().filter(e -> e.department.equals("IT")).mapToInt(e -> e.salary).sum();
        System.out.println("Total Salary of IT: " + TotalSalaryIT);
    }
}
