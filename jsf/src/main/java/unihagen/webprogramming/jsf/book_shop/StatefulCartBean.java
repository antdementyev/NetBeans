package unihagen.webprogramming.jsf.book_shop;

import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateful;

@Stateful   // "Stateful" = own instance for each Client
public class StatefulCartBean {

    private List<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        if (book != null)
            books.add(book);
    }

    public List<Book> getBooks() {
        return books;
    }
}
