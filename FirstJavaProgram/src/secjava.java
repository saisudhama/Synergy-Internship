import java.util.Scanner;

public class secjava {
    public static void main(String[] args) {
        
        // swap two variables taken from user using third variable
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int a = sc.nextInt();
        System.out.println("Enter second number: ");
        int b = sc.nextInt();
        System.out.println("Before swapping: a = " + a + " b = " + b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After swapping: a = " + a + " b = " + b);

        printIloveJava();
        whileloop();

        System.out.println("Enter a number: ");
        int n = sc.nextInt(); 
        fact(n); 
        
        sc.close();
    }

    // Print I love Java 5 times using while loop
    public static void printIloveJava() {
        int i = 0;
        while (i < 5) {
            System.out.println("I love Java");
            i++;
            System.out.println(i);
        }
    }

    public static void whileloop() {
        int a=10, b=20;
        while (a > b) {
            System.out.println("a is less than b");
        }
        System.out.println("a is not less than b");
    }

    public static void fact(int n) {
        int fact = 1;
        int i = 2;
        while (i <= n) {
            fact = fact * i;
            i++;
        }
        System.out.println("Factorial of " + n + " is " + fact);
    }
}