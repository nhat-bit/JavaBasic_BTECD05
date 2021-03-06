package Project.controllers;

import Project.models.Book;
import Project.services.BookDataService;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class BookManager {

    private List<Book> list;
    private final String pathFileToInput; // "./resources/book-input.txt"
    private BookDataService service;

    public BookManager(String pathFileToInput) {

        this.pathFileToInput = pathFileToInput;

        this.service = new BookDataService();

        try {

            this.list = service.read(pathFileToInput);

        } catch (IOException ex) {

            ex.printStackTrace();
        }
    }

    public Book findByName(String name) {

        for (Book s: list) {

            if (s.getName().equals(name)) {
                return s;
            }
        }

        return null;
    }
    
    public Book findById(int id) {

        for (Book s: list) {

            if (s.getId() == id) {
                return s;
            }
        }

        return null;
    }
    
    public Book findByAuthor(String author) {

       for (Book s: list) {

            if (s.getAuthor().equals(author)) {
                
                return s;
            }
        }

        return null;
    }
    
    public Book findByPrice(String price) {

       for (Book s: list) {

            if (s.getPrice().equals(price)) {
                
                return s;
            }
        }

        return null;
    }

    public void addBook(Scanner sc) {

        list.add(new Book().input(sc));
    }

    public void editBook(Scanner sc) {

        System.out.println("Enter id: ");

        int id = sc.nextInt();
        sc.nextLine();// ignore new line

        Book book = findById(id);
        book.edit(sc);
    }

    public void deleteBook(Scanner sc) {

        System.out.println("Enter id: ");

        int id = sc.nextInt();
        sc.nextLine();

        Book book = findById(id);
        list.remove(book);
    }

    public void showAll() {

        for (Book s: list) {
            System.out.println(s.toString());
        }
    }

}