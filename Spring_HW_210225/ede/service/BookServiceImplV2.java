package org.telran.ede.service;

import org.springframework.stereotype.Service;
import org.telran.ede.model.Book;

import java.util.Arrays;
import java.util.List;

@Service
public class BookServiceImplV2 implements BookService{

    @Override
    public List<Book> getAllBooks() {
        return Arrays.asList(new Book("Hello"));
    }
}
