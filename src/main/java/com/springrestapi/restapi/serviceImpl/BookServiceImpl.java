package com.springrestapi.restapi.serviceImpl;

import com.springrestapi.restapi.entity.Book;
import com.springrestapi.restapi.service.BookService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    List<Book> list;

    public BookServiceImpl() {
        list = new ArrayList<>();
        list.add(new Book(1, "Head First Java", "Kathy Sierra & Bert Bates"));
        list.add(new Book(2, "Clean Code", "Robert C. Martin"));
    }

    @Override
    public List<Book> getBooks() {
        return list;
    }

    @Override
    public Book getBook(long bookId) {
        Book b = null;
        for (Book book : list) {
            if (book.getBookId() == bookId) {
                b = book;
                break;
            }
        }
        return b;
    }

    @Override
    public Book addBook(Book book) {
        list.add(book);
        return book;
    }

    @Override
    public Book updateBook(Book book) {
        for (Book e : list)
            if (e.getBookId() == book.getBookId()) {
                e.setBookTitle(book.getBookTitle());
                e.setBookAuthor(book.getBookAuthor());
            }
        return book;
    }

    @Override
    public Book deleteBook(long bookId) {
        List<Book> result = new ArrayList<>();
        for (Book e : this.list)
            if (e.getBookId() != bookId) {
                result.add(e);
            }
        list= result;
        return null;

    }

}

