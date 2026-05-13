package com.example.bookstore;

import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class BookService {

    private List<Book> books = new ArrayList<>();

    public BookService() {

        books.add(new Book(1,"The Lovely Bones","Alice Sebold",500,"https://covers.openlibrary.org/b/title/The%20Lovely%20Bones-L.jpg",4.6,1245));
        books.add(new Book(2,"The Lion, the Witch and the Wardrobe","C.S. Lewis",450,"https://covers.openlibrary.org/b/title/The%20Lion,%20the%20Witch%20and%20the%20Wardrobe-L.jpg",4.8,2104));
        books.add(new Book(3,"To Kill a Mockingbird","Harper Lee",599,"https://covers.openlibrary.org/b/title/To%20Kill%20a%20Mockingbird-L.jpg",4.9,5821));
        books.add(new Book(4,"The Pragmatic Programmer","Andrew Hunt",520,"https://covers.openlibrary.org/b/title/The%20Pragmatic%20Programmer-L.jpg",4.7,1842));
        books.add(new Book(5,"The Hobbit","Colleen Hoover",550,"https://covers.openlibrary.org/b/title/The%20Hobbit-L.jpg",4.8,3270));
        books.add(new Book(6,"It Ends With Us","C.S. Lewis",480,"https://covers.openlibrary.org/b/title/It%20Ends%20With%20Us-L.jpg",4.6,1408));
        books.add(new Book(7,"The Da Vinci Code","Dan Brown",500,"https://covers.openlibrary.org/b/title/The%20Da%20Vinci%20Code-L.jpg",4.5,1950));
    }

    public List<Book> getAllBooks(){
        return books;
    }

    public Book getBookById(int id){
        return books.stream()
                .filter(b -> b.getId()==id)
                .findFirst()
                .orElse(null);
    }
}

