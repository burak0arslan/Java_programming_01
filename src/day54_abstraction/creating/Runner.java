package day54_abstraction.creating;

public class Runner {
    public static void main(String[] args) {

        //Create obj = new Create(); cannot make objects of the interfaces

        Book obj = new Book();  //book is non-abstract class

        obj.read();
        obj.write();

    }
}
