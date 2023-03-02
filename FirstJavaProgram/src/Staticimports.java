import static java.lang.Math.sqrt;

// Singleton class
class Main {
    public static void main(String[] args) {
        // System.out.println(Math.sqrt(25));
        System.out.println(sqrt(25));

        Staticimports obj = Staticimports.getInstance();
        obj.a = 20;
        System.out.println(obj.a);

        // Staticimports obj2 = new Staticimports(); // error because constructor is private
        Staticimports obj2 = Staticimports.getInstance();
        System.out.println(obj2.a);

        // util is a singleton class example
}

}

public class Staticimports {
    static Staticimports instance = null;
    public int a = 10;

    private Staticimports() {
        // private constructor
    }

    public static Staticimports getInstance() {
        if (instance == null) {
            instance = new Staticimports();
        }
        return instance;
    }
    
}
