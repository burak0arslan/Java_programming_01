package day51_inheritance.Season;

public class Summer extends Season{

    public Summer(double hiAt,double loAt){
        super("Summer", hiAt, loAt);
    }
    @Override
    public void activity(){
        System.out.println("Drink lemonade");
    }


}
