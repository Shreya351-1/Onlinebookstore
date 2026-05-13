package com.example.bookstore;

import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class CartService {

    private List<Book> cart = new ArrayList<>();

    public List<Book> getCart() {
        return cart;
    }

    public void addToCart(Book book) {
        cart.add(book);
    }

    public void removeFromCart(int id) {
        cart.removeIf(b -> b.getId() == id);
    }

    public void clearCart() {
        cart.clear();
    }
}
