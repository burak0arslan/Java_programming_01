package day47_encapsulation;

public class Computer {

    String brand;
    double price;
    String color;

    static boolean hasScreen;
    static boolean hasBattery;
    static boolean hasMemory;

    static {
        System.out.println("Static block run");
        hasBattery = true;
        hasScreen = false;
        hasMemory = true;
    }

    public Computer(String brand, double price, String color) {
        System.out.println("constructor run");
        this.brand = brand;
        this.price = price;
        this.color = color;
    }
}
