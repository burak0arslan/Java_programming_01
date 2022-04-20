package day49_inheritance;

public class Library {
    public static void main(String[] args) {

        Book b1 = new Book();
        b1.title = "Natural Life";
        b1.author = "Burak";
        b1.genre = "Epic";
        b1.chapter = 12;
        b1.price = 36;
        b1.hasMovie = false;
        System.out.println(b1);

        AudioBook a1 = new AudioBook();
        a1.author = "Saim";
        a1.title = "Java Hand Book";
        a1.duration = 13.56;
        a1.genre = "Tech";
        a1.chapter = 3;
        a1.price = 79;
        a1.narrator = "Nadir";
        a1.listen();
        System.out.println(a1);

        EBook e1 = new EBook();
        e1.author = "Akif";
        e1.title = "Java E-Book";
        e1.size = 322;
        e1.pages = 1022;
        e1.read();
        System.out.println(e1);
    }
}
