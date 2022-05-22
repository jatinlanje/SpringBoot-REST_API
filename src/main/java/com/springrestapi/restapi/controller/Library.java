package com.springrestapi.restapi.controller;

import com.springrestapi.restapi.entity.Book;
import com.springrestapi.restapi.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//REST controller for creating RESTful web services
@RestController
public class Library {

    //enables automatic dependency injection
    @Autowired
    private BookService bookService;

    //home page
    @GetMapping("/home")
    public String home(){
        return "welcome to my Library";
    }

    //get the books
    @GetMapping("/books")
    public List<Book> getBooks(){
        return this.bookService.getBooks();
    }

    //get the book with specific id
    @GetMapping("/books/{bookId}")
    public Book getBook(@PathVariable long bookId){
        return this.bookService.getBook(bookId);
    }

    //add the book
    @PostMapping("/books")
    public Book addBook(@RequestBody Book book){
        return this.bookService.addBook(book);
    }

    //update the book
    @PutMapping("/books")
    public Book updateBook(@RequestBody Book book){
        return this.bookService.updateBook(book);
    }

    //delete the book
    @DeleteMapping("/books/{bookId}")
    public Book deleteBook(@PathVariable long bookId){
        return this.bookService.deleteBook(bookId);
    }

}
