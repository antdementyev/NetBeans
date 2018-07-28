package unihagen.webprogramming.jsf.book_shop;

public class Book {

    private String author;
    private String title;

    public Book(String author, String title) {
        this.author = author;
        this.title = title;
    }

    @Override
    public String toString() {
        return "Buch: " + this.title + "  von  " + this.author;
    }
}
