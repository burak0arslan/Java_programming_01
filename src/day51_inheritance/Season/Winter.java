package day51_inheritance.Season;

public class Winter extends Season{

    public Winter(double hiAt,double loAt){
        super("Winter", hiAt, loAt);
    }
    @Override
    public void activity(){
        System.out.println("Use fireplace");
    }
}
