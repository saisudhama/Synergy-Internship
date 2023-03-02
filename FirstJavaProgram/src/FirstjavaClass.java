public class FirstjavaClass {
    public static void main(String[] args) {

        /**
         * This is a simple Java program.
         */

        // Prints "Hello, World" in the terminal window.

        /*
         * alt + shift + a for comment
         * alt + shift + f for format
         * ctrl + shift + o for import
         */
        System.out.println("Hello World");

        int main = 10;
        System.out.println(main);

        // call method
        implicitTypeCasting();
        explicitTypeCasting();

        // simple assignment
        int a = 10;
        int b = 20;
        int c = 0;
        c = a + b;
        System.out.println("c = a + b = " + c);

        // shorthand assignment
        c += a;
        System.out.println("c += a = " + c);

        // chained assignment
        c = a = b = 100;
        System.out.println("c = a = b = " + c);

        // compound assignment
        c = a + b;
        System.out.println("c = a + b = " + c);
    }

    // implicit type casting
    public static void implicitTypeCasting() {
        int i = 100;
        long l = i;
        float f = l;
        System.out.println("Int value " + i);
        System.out.println("Long value " + l);
        System.out.println("Float value " + f);
    }

    // explicit type casting
    public static void explicitTypeCasting() {
        double d = 100.04;
        long l = (long) d;
        int i = (int) l;
        System.out.println("Double value " + d);
        System.out.println("Long value " + l);
        System.out.println("Int value " + i);
    }
}