package me.dhwanildesai;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;
import java.util.*;

//In the BookController I am using Methods/Services which i have created in the BookMethod.java
//RestController : Spring RestController annotation is used to create RESTful web services using Spring MVC
//RequestMapping : This annotation maps HTTP requests to handler methods of MVC and REST controllers.
//Autowired use : It requires less code because we don’t need to write the code to inject the dependency explicitly.
@SuppressWarnings("ALL")
@RestController
public class BookController {

    @Autowired
    private BookMethod bookMethod; //Creating the instance of the BookMethod here to use all the methods of the BookMethod.java


    @RequestMapping("/books")
    public List<Book> getBooks(){

        return this.bookMethod.getBooks();

    }

    @RequestMapping("/books/{isbn}")
    public Optional<Book> getBookByIsbn(@PathVariable String isbn){
        return bookMethod.getBookByIsbn(isbn);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/books")
    public String addBook(@RequestBody Book book){
        bookMethod.addBook(new Book(book.getisbn(), book.getTitle(), book.getAuthor(), book.getNo_of_pages(), book.isRead()));

        return "Congrats you added one book";
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/books/{isbn}")
    public void deleteBook(@PathVariable String isbn){
        bookMethod.deleteBook(isbn);
        System.out.println("You have successfully deleted the book");


    }






}
