public class AbstractMain {
    public static void main(String[] args) {
        AbstractCar c1 = new CarAudi();
        AbstractCar c2 = new CarFerarri();
        RepairCar r1 = new RepairCar();
        r1.carrepair(c1);
        r1.carrepair(c2);
    }
}
