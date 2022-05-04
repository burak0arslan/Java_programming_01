package day54_abstraction.creating;

public class Book implements Create{

    @Override
    public void read() {
        System.out.println("Reading book");
    }

    @Override
    public void write() {
        System.out.println("writing the book");
    }
}
