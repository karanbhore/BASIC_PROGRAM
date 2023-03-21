package com.prowings.BasicPrograms.ClassObject;
public class Book {
    private int bookNumber;
    private String bookName;
    private double price;
    private String author;
    
    public Book(int bookNumber, String bookName, double price, String author) {
        this.bookNumber = bookNumber;
        this.bookName = bookName;
        this.price = price;
        this.author = author;
    }
    
    public int getBookNumber() {
        return bookNumber;
    }
    
    public String getBookName() {
        return bookName;
    }
    
    public double getPrice() {
        return price;
    }
    
    public String getAuthor() {
        return author;
    }
    
    public static Book findBook(int bookNumber, Book[] books) {
        for (Book book : books) {
            if (book.getBookNumber() == bookNumber) {
                return book;
            }
        }
        return null;
    }
    public static void main(String[] args) {
        Book book1 = new Book(101, "To Kill a Mockingbird", 12.99, "Harper Lee");
        Book book2 = new Book(102, "1984", 9.99, "George Orwell");
        Book book3 = new Book(103, "The Great Gatsby", 10.99, "F. Scott Fitzgerald");
        
        Book[] books = {book1, book2, book3};
        
        int bookNumber = 102;
        Book foundBook = Book.findBook(bookNumber, books);
        
        if (foundBook != null) {
            System.out.println("Book found:");
            System.out.println("Book Number: " + foundBook.getBookNumber());
            System.out.println("Book Name: " + foundBook.getBookName());
            System.out.println("Price: $" + foundBook.getPrice());
            System.out.println("Author: " + foundBook.getAuthor());
        } else {
            System.out.println("Book not found.");
        }
    }

}
