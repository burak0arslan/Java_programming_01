package day52_inheritance.final_example;

public class FinalExample {     // final means can not be inherited or changed

    final int a = 5;    // -*-instance variable belongs to class
    final int b;

    public static final String PLANET = "Earth";  // -*-constant variable belongs to each object (vriable name must be capital letters)

    public FinalExample(int b){
        this.b = b;
    }
}
