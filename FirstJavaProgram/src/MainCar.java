public class MainCar {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.name = "BMW";
        c1.color = "Black";
        c1.wheels = 4;
        c1.display();

        Car c2 = new Car();
        c2.name = "Audi";
        c2.color = "White";
        c2.wheels = 4;
        c2.display();
    }
}
