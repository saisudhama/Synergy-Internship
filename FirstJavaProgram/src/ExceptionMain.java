public class ExceptionMain {
    public static void main(String[] args) {
        System.out.println("Hello");
        try{
            System.out.println(10/0);
        } catch (Exception e) {
            System.out.println("Exception caught: " + e);
            System.out.println();
            e.printStackTrace();
            System.out.println();
            System.out.println("Message: " + e.getMessage());
            System.out.println();
            System.out.println("Cause: " + e.getCause());
            System.out.println();
            System.out.println("To string: " + e.toString());
            }
        System.out.println("Bye");

    }

}
