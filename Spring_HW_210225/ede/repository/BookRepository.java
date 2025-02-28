package org.telran.ede.repository;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.telran.ede.model.Book;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.ArrayList;
import java.util.List;

@Repository
public class BookRepository {

    private List<Book> books = new ArrayList<>();

    public BookRepository() {

    }

    @PostConstruct
    public void init() {
        books.add(new Book("BookOne"));
        books.add(new Book("BookTwo"));
    }

    public List<Book> getBooks() {
        return books;
    }

    @PreDestroy
    public void clean() {
        books.clear();
        System.out.println("List cleaned");
    }
}
