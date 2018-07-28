package unihagen.webprogramming.jsf.book_shop;

import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

@Named
@SessionScoped
public class ManagedCartBean implements Serializable {

    @EJB
    private StatefulCartBean shoppingCart;
    
    // for booking new book
    private String author;
    private String title;

    public void addBook() {
        if (author == null || author.isEmpty() || title == null || title.isEmpty()) {
            return;
        }
        Book newBookToAdd = new Book(author, title);
        shoppingCart.addBook(newBookToAdd);
    }

    public List<Book> getBooks() {
        return shoppingCart.getBooks();
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
