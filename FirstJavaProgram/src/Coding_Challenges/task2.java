package Coding_Challenges;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

interface I1 {
    int a = 10; // public static final int a = 10;
    void method1(); // public abstract void method1();
}

class C1 implements I1 {
    public void method1() {
        System.out.println("Method 1 with value of a = " + a);  
    }
}

public class task2 {
    public static void main(String[] args) {
        C1 c1 = new C1();
        c1.method1();

        // try with resources
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a number: ");
            int num = sc.nextInt();
            System.out.println("You entered: " + num);
        } catch (Exception e) {
            System.out.println(e);
        }

        List<Integer> l = Arrays.asList(2,3,4,5,6);
        l.stream().filter(n -> n % 2 == 0).forEach(System.out::println);

        String s = "big black bug bit a big black dog on his big black nose";
        List<String> l1 = Arrays.asList(s.split(" "));

        Map<String,Long> mp1 = l1.stream().collect(Collectors.groupingBy(k->k,Collectors.counting()));
        System.out.println(mp1);

    }
}
