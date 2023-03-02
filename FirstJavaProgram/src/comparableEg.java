import java.util.Arrays;
import java.util.Comparator;

public class comparableEg { //class name should be captialized
    
    public static void main(String[] args) {
        String[] names = {"John", "Paul", "George", "Ringo"};
        Arrays.sort(names);
        for (String name : names)
            System.out.println(name);

        student s1 = new student("John", 20, 1);
        student s2 = new student("Paul", 21, 2);
        student s3 = new student("George", 22, 3);

        student[] students = {s1, s2, s3};
        Arrays.sort(students);
        for (student s : students)
            System.out.println(s.toString());
        
        /* char data[] = {'a', 'b', 'c'};
        String str = new String(data);
        System.out.println(str); */



        Arrays.sort(students, new nameComparator());
        for (student s : students)
            System.out.println(s.toString());

        // equals method in student class
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s1));
    }

    public static int addTwoNumbers(int a, int b){ //method name should be camelCase
        return a+b;
    }
}

class nameComparator implements Comparator<student> {

    @Override
    public int compare(student s1, student s2) {
        return s1.getName().compareTo(s2.getName());
    }



}