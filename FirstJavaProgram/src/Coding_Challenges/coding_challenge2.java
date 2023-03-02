package Coding_Challenges;

import java.util.Scanner;

public class coding_challenge2 {
    public static void main(String[] args)
    {
        System.out.println("Please enter your age: ");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if (age >= 21 && age < 55)
        {
            System.out.println("Savings Account");
        }
        else if (age >= 55)
        {
            System.out.println("Senior Citizen Account");
        }
        else if (age < 21)
        {
            System.out.println("Ineligible");
        }

        sc.close();
    }
}
