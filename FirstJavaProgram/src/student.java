public class student implements Comparable<student> {
    private String name;
    private int age;
    private int rollNo;
    
    public student(String name, int age, int rollNo) {
        this.name = name;
        this.age = age;
        this.rollNo = rollNo;
    }
    
    public String getName() {
        return name;
    }
    
    public int getAge() {
        return age;
    }
    
    public int getRollNo() {
        return rollNo;
    }
    
    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age + ", Roll No: " + rollNo;
    }
    
    @Override
    public int compareTo(student s) {
        // return this.name.compareTo(s.name);
        if (this.age > s.age)
            return 1;
        else if (this.age < s.age)
            return -1;
        else
            return 0;

    
    
    }
}
    
