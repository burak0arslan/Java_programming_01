package day51_inheritance.Season;

public class UseSeason {
    public static void main(String[] args) {

        Summer obj1 = new Summer(71,60);
        System.out.println(obj1);
        obj1.activity();

        Fall obj2 = new Fall(66,45);
        System.out.println(obj2);
        obj2.activity();
    }
}
