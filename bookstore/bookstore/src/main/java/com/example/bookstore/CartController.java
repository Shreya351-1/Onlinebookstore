package com.example.bookstore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@CrossOrigin
public class CartController {

    @Autowired
    private CartService cartService;

    @Autowired
    private BookService bookService;

    @PostMapping("/cart/{id}")
    public void addToCart(@PathVariable int id) {
        Book book = bookService.getBookById(id);
        cartService.addToCart(book);
    }

    @GetMapping("/cart")
    public List<Book> getCart() {
        return cartService.getCart();
    }

    @DeleteMapping("/cart/{id}")
    public void remove(@PathVariable int id) {
        cartService.removeFromCart(id);
    }

    @PostMapping("/checkout")
    public String checkout() {
        cartService.clearCart();
        return "Order placed successfully!";
    }
}
