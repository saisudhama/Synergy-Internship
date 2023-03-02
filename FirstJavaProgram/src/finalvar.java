public class finalvar {
    final int var;
    final static int var2;
    static int var3; // static variable is initialized to 0 by default
    {
        var = 10;
        System.out.println("Inside instance block");
    }

    static {
        var2 = 20;
        System.out.println("Inside static block");
    }

    public static void main(String[] args) {
        finalvar obj = new finalvar();
        finalvar obj2 = new finalvar();
        System.out.println(obj.var);
        System.out.println(var2);
        System.out.println(var3);
        System.out.println(obj2.var);
    }

}
