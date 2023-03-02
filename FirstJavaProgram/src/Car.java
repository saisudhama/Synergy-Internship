public class Car {
    public String name;
    public String color;
    public int wheels;

    public Car() {
        this.name = "DefaultName";
        this.color = "DefaultColor";
        this.wheels = 4;
    }

    public Car(String name, String color, int wheels) {
        this.name = name;
        this.color = color;
        this.wheels = wheels;
    }

    public void display()
    {
        System.out.println("Name: " + name);
        System.out.println("Color: " + color);
        System.out.println("Wheels: " + wheels);
    }
}
