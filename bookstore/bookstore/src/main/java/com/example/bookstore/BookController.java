package com.example.bookstore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@CrossOrigin
public class BookController {

    @Autowired
    private BookService service;

    @GetMapping("/books")
    public List<Book> getBooks() {
        return service.getAllBooks();
    }

    @GetMapping("/books/{id}")
    public Book getBook(@PathVariable int id) {
        return service.getBookById(id);
    }
}