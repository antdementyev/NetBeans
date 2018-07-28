package unihagen.webprogramming.jsf.book_shop;

import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import javax.interceptor.AroundInvoke;
import javax.interceptor.InvocationContext;

@Named
@SessionScoped
public class ManagedCartBean implements Serializable {

    @EJB
    private StatefulCartBean shoppingCart;
    
    // for booking new book
    private String author;
    private String title;

    public String addBook() {
        if (author == null || author.isEmpty() || title == null || title.isEmpty()) {
            return "";
        }

        Book newBookToAdd = new Book(author, title);
        shoppingCart.addBook(newBookToAdd);
        return "cart.xhtml";
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

    @AroundInvoke
    private Object log(InvocationContext context) throws Exception {
        String methodName = context.getMethod()
                .getName();
        System.out.println("Start " + methodName);

        Object proceed = context.proceed();

        System.out.println("Finish " + methodName);

        return proceed;
    }
}
