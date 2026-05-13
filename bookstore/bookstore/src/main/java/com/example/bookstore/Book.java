package com.example.bookstore;

public class Book {

    private int id;
    private String title;
    private String author;
    private int price;
    private String image;

    // NEW
    private double rating;
    private int reviewCount;

    public Book(int id,
                String title,
                String author,
                int price,
                String image,
                double rating,
                int reviewCount) {

        this.id = id;
        this.title = title;
        this.author = author;
        this.price = price;
        this.image = image;
        this.rating = rating;
        this.reviewCount = reviewCount;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPrice() {
        return price;
    }

    public String getImage() {
        return image;
    }

    // NEW
    public double getRating() {
        return rating;
    }

    public int getReviewCount() {
        return reviewCount;
    }
}