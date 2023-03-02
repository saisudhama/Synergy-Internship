package Coding_Challenges;

import java.util.Scanner;

public class coding_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        do
        {
            System.out.println("Enter two numbers: ");
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println("sum = " + (a+b));
            System.out.println("Enter 1 to continue and 0 to exit");
        } while (sc.nextInt() == 1);

        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        num_table(n);

        sc.close();
        int i = 10;
        while(i<10)
        {
            System.out.println("Hello");
        }
        System.out.println("Bye");
    }

    public static void num_table(int n) {
        for(int i=1;i<=10;i++)
        {
            System.out.println(n + " * " + i + " = " + (n*i));
        }
        
    }
}
