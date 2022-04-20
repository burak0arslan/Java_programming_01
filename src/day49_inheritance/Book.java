package day49_inheritance;

public class Book {

    String title;
    String author;
    String genre;
    int chapter;
    double price;
    boolean hasMovie;

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", genre='" + genre + '\'' +
                ", chapter=" + chapter +
                ", price=" + price +
                ", hasMovie=" + hasMovie +
                '}';
    }
}
