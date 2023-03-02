import java.util.Scanner;

public class customexcp {
    public static void main(String[] args) {
        System.out.println("Enter age");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        sc.close();
        if (age < 18) {
            throw new TooYoungException("You are too young");
        } else if (age > 60) {
            throw new TooOldException("You are too old");
        } else {
            System.out.println("You are eligible");
        }
    }
    
}
