package Coding_Challenges;

public class Student {
    public String name;
    public int Class;
    public int marks;

    public Student(String name, int Class, int marks) {
        this.name = name;
        this.Class = Class;
        this.marks = marks;
    }

    public String toString() {
        return "Name: " + name + ", Class: " + Class + ", Marks: " + marks;
    }

    //getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }


}
