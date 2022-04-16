package day47_encapsulation;

public class Bank {
    public static void main(String[] args) {
        System.out.println(DebitCard.accountType);

        DebitCard obj1 = new DebitCard(1234567891112141L,"James", 1_000_000);
        System.out.println(obj1);

        System.out.println();
        DebitCard obj2 = new DebitCard(12132132,"Ben",1_000_990);
        System.out.println(obj2);
        System.out.println(obj2.accountType);

        //  valid values
        System.out.println();
        DebitCard obj3 = new DebitCard(1234567891112141L,"James", "Visa" ,7000, 1_000_000);
        System.out.println(obj1);
        //  invalid values
        System.out.println();
        DebitCard obj4 = new DebitCard(123456789111L,"James", "Money" ,7, 1_000_000);
        System.out.println(obj1);


    }
}
