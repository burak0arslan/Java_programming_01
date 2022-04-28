package day53_abstraction.cars;

public class Tesla extends ElectricCar{

    @Override
    public void start() {
        System.out.println("Card in the car");
        System.out.println("Press button");
    }

    @Override
    public void charge() {
        System.out.println("Charging tesla");
    }
}
