package day51_inheritance.Season;

public class Season {

    String name;
    double hiAt;
    double loAt;

    public Season(String name,double hiAt,double loAt){
        this.name=name;
        this.hiAt=hiAt;
        this.loAt=loAt;
    }

    public void activity(){
        System.out.println("");
    }

    @Override
    public String toString() {
        return "Season{" +
                "name='" + name + '\'' +
                ", hiAt=" + hiAt +
                ", loAt=" + loAt +
                '}';
    }
}
