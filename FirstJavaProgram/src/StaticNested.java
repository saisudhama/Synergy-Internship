public class StaticNested {
    private int x;
    int y;

    class Nested {
        void method1() {
            System.out.println(x);
            System.out.println(y);
        }
    }    
    
    static class staticNested2 {
        public void method2() {
            System.out.println("Static nested class");
        }
    }

    public static void main(String[] args) {

        StaticNested obj = new StaticNested();
        StaticNested.Nested obj2 = obj.new Nested();
        obj2.method1();

        StaticNested.staticNested2 obj3 = new StaticNested.staticNested2();
        obj3.method2();

        System.out.println("Hello");
        try{
            System.out.println(10/0);
        } catch (Exception e) {
            System.out.println("Exception caught" + e);
            e.printStackTrace();
            }
        System.out.println("Bye");
    }
}
