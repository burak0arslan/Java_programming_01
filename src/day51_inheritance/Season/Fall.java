package day51_inheritance.Season;

public class Fall extends Season{

    public Fall(double hiAt,double loAt){
        super("fall",hiAt,loAt);
    }
    public void activity(){
        System.out.println("Read a book");
    }
}
