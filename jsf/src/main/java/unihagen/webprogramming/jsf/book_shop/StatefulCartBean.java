package unihagen.webprogramming.jsf.book_shop;

import javax.ejb.LocalBean;
import javax.ejb.Stateful;
import java.util.ArrayList;
import java.util.List;

@Stateful   // "Stateful" = own instance for each Client
@LocalBean
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
