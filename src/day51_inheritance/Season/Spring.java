package day51_inheritance.Season;

public class Spring extends Season{
    public Spring(double hiAt,double loAt){
        super("Spring", hiAt, loAt);
    }
    public void activity(){
        System.out.println("Go outside");
    }
}
