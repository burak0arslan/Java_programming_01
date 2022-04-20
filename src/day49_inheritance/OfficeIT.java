package day49_inheritance;

import day47_encapsulation.DebitCard;

public class OfficeIT {
    public static void main(String[] args) {

        Employee p1 = new Employee();
        p1.name = "John";
        p1.salary = 1_000_000;
        p1.isFulltime = true;
        p1.work();

        Tester t1 = new Tester();
        t1.name = "Kyrie";
        t1.isFulltime = true;
        t1.salary = 3_000_000;
        t1.bugsFound = 9;
        t1.test();

        Developer d1 = new Developer();
        d1.name = "Huseyin";
        d1.isFulltime = true;
        d1.salary = 8_000_000;
        d1.featuresCreated = 18;
        d1.develop();
        System.out.println(d1);

    }
}
