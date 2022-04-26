package day51_inheritance.Devices;

public class Phone extends Device{

    public Phone(String brand,String model,double price, boolean wireless){
        super(brand, model, price, wireless);
    }

    @Override public void useDevice(){
        System.out.println("Using phone");
    }

}
