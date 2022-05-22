package com.springrestapi.restapi.service;

import com.springrestapi.restapi.entity.Book;

import java.util.List;

public interface BookService {
    public List<Book> getBooks();
    public Book getBook(long bookId);
    public Book addBook(Book book);
    public Book updateBook(Book book);
    public Book deleteBook(long bookId);

}
