import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class ThrowsExcep {
    public static void main(String[] args) throws FileNotFoundException {
        method1();

    }

    private static void method1() throws FileNotFoundException {
        method2();
    }

    private static void method2() throws FileNotFoundException{
        try (PrintWriter pw = new PrintWriter("output.txt")) {
        }
    }

}
