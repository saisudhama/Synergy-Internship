package Coding_Challenges;

import java.util.Scanner;

public class c_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Grade: ");
        char grade = sc.next().charAt(0);
        switch (grade) {
            case 'A':
                System.out.println("Excellent");
                break;
            case 'B':
                System.out.println("Amazing");
                break;
            case 'C':
                System.out.println("Well Done");
                break;
            case 'D':
                System.out.println("You can do better");
                break;
            default:
                System.out.println("Invalid Grade Entered");
                break;
        }
        sc.close();
    }
}
