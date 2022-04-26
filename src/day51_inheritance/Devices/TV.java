package day51_inheritance.Devices;

public class TV extends Device{

    public TV(String brand,String model,double price,boolean wireless){
        super(brand, model, price, wireless);
    }
    @Override
    public void useDevice(){
        System.out.println("using TV");
    }

}
