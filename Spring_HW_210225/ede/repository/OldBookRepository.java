package org.telran.ede.repository;


import org.springframework.stereotype.Repository;
import org.telran.ede.model.Book;

import java.util.Arrays;
import java.util.List;

@Repository
public class OldBookRepository {

    public List<Book> getOldBooks() {
        return Arrays.asList(new Book("OldBookOne"), new Book("OldBookTwo"));
    }
}
