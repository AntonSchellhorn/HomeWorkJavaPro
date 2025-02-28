package org.telran.ede.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.telran.ede.model.Book;
import org.telran.ede.service.BookService;
import org.telran.ede.service.BookServiceImpl;
import org.telran.ede.service.BookServiceImplV2;
import org.telran.ede.service.MonitorService;

import java.util.List;

@Controller // спринг увидев эту аннотацию, создаст объект этого класса и сделает его бином
public class BookController {

    //1) Inject by filed (by type) private BookService bookService;
    //   Inject by filed (by name) private BookService bookServiceImplV2;
    @Autowired
    @Qualifier("bookServiceImpl") //уточнить какой бин сюда нужно подставить
    private BookService bookService;

//    @Autowired
//    private BookService bookServiceImpl;
//
//    @Autowired
//    private BookService bookServiceImplV2;
//
//    @Autowired(required = false)
//    private MonitorService monitorService;

    //2) Construction injection
    //    @Autowired
    //    public BookController(BookService bookService) {
    //        this.bookService = bookService;
    //    }

    public List<Book> getBooks() {
//        monitorService.increase();
        return bookService.getAllBooks();
    }
}
