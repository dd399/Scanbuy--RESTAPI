package me.dhwanildesai;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

//Autowired use : It requires less code because we don’t need to write the code to inject the dependency explicitly.
@Service
public class BookMethod {
    @Autowired
    private BookInterface bookInterface;


    public List<Book> getBooks(){

        List<Book> books = new ArrayList<>();
        this.bookInterface.findAll().forEach(books::add); //Using bookInterface i am getting access to use get operation here to find books which i have already added in the database
        return books;

    }
    //Optional : Here we can get output of the book or we also cannot. It can be null that i why Optional is used. Again upon ISBN it will find the book.
    public Optional<Book> getBookByIsbn(String isbn){
        return bookInterface.findById(isbn);
    }


    //Using Post method i am adding the book in the database which i will be doing in the BookController.java
    public void addBook(Book book){
        this.bookInterface.save(book);
    }


    //Using delete method i am deleting the book from the database, which i will be doing in the BookController.java
    public void deleteBook(String isbn){
        bookInterface.deleteById(isbn);

    }

}
