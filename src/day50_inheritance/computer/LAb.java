package day50_inheritance.computer;

public class LAb {
    public static void main(String[] args) {

        Computer obj1 = new Computer("Generic os",300);
        System.out.println(obj1);

        Windows obj2 = new Windows(500);
        System.out.println(obj2);

        Mac obj3 = new Mac("Mac",300);
        System.out.println(obj3);

    }
}
