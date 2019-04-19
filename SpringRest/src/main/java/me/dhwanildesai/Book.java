package me.dhwanildesai;

import javax.persistence.*;
//Here i have created Table name Book in Book1 database in which threre are 5 fields Isbn(Barcode), title, author, no_of_pages, and the read or not functionality.

@Entity
@Table(name = "Book")
public class Book {

    @Id
    private String isbn;
    private String title;
    private String author;
    private int no_of_pages;
    @Column(name = "read1")
    private boolean read;

    //Constructor of the Book empty -- requirement of the Spring boot
    public Book() {
    }
    // Consturctor of Book with all the argument
    public Book(String isbn, String title, String author, int no_of_pages, boolean read) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.no_of_pages = no_of_pages;
        this.read = read;
    }


    // Using getter and setters functionality of the IDE to make it. Code -> Generate -> getters/setters

    public String getisbn() {
        return isbn;
    }

    public void setisbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getNo_of_pages() {
        return no_of_pages;
    }

    public void setNo_of_pages(int no_of_pages) {
        this.no_of_pages = no_of_pages;
    }

    public boolean isRead() {
        return read;
    }

    public void setRead(boolean read) {
        this.read = read;
    }
}