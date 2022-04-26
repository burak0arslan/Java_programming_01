package day51_inheritance.Devices;

public class UseDevice {
    public static void main(String[] args) {
        TV obj1 = new TV("Sa","as",324,true);
        System.out.println(obj1);

        obj1.useDevice();

        Phone obj2 = new Phone("Iphone","12promax",650,true);
        System.out.println(obj2);
        obj2.useDevice();

        }


}
