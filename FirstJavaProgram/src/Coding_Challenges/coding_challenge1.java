package Coding_Challenges;

import java.util.Scanner;

public class coding_challenge1 {
    public static void main(String[] args)
    {
        System.out.println("Please enter your age: ");
        try (Scanner sc = new Scanner(System.in)) {
            int age = sc.nextInt();
            if (age >= 21)
            {
                System.out.println("Eligible");
            }
            else
            {
                System.out.println("Ineligible");
            }
        }
    }
}
