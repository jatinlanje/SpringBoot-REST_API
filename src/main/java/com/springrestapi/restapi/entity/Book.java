package com.springrestapi.restapi.entity;

// Creating an entity Book
public class Book {
    private long bookId;
    private String bookTitle;
    private String bookAuthor;

    //Parameterized Constructor to assign the values to the properties of the entity
    public Book(long bookId, String bookTitle, String bookAuthor) {
        this.bookId = bookId;
        this.bookTitle = bookTitle;
        this.bookAuthor = bookAuthor;
    }

    //Default Constructors
    public Book() {
        super();
    }

    //Getters and Setters of the properties
    public long getBookId() {
        return bookId;
    }

    public void setBookId(long bookId) {
        this.bookId = bookId;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    //toString() to find all the values
    @Override
    public String toString() {
        return "Book{" +
                "bookId=" + bookId +
                ", bookTitle='" + bookTitle + '\'' +
                ", bookAuthor='" + bookAuthor + '\'' +
                '}';
    }
}
