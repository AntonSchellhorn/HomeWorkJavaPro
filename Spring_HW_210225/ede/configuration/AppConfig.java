package org.telran.ede.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.telran.ede.controller.BookController;
import org.telran.ede.repository.BookRepository;
import org.telran.ede.repository.MonitorRepository;
import org.telran.ede.repository.OldBookRepository;
import org.telran.ede.service.BookServiceImpl;
import org.telran.ede.service.BookServiceImplV2;
import org.telran.ede.service.MonitorServiceImpl;

@Configuration // указывает спрингу, что в этом классе прописываются настройки бинов
@ComponentScan(basePackages = "org.telran.ede")// Говорим Spring сканировать этот пакет и его подпакеты на наличие бинов
public class AppConfig {

    @Bean
    public OldBookRepository oldBookRepository() {
        return new OldBookRepository();
    }

//    @Bean // данный объект будет передан спрингу как спринг бин
//    public BookServiceImplV2 bookServiceImplV2() {
//        return new BookServiceImplV2();
//    }
//
//    @Bean
//    public BookController bookController() {
//        return new BookController();
//    }
//
//    @Bean
//    public MonitorRepository monitorRepository() {
//        return new MonitorRepository();
//    }

//    @Bean
//    public MonitorServiceImpl monitorService() {
//        return new MonitorServiceImpl();
//    }
//
//    @Bean BookServiceImpl bookServiceImpl(BookRepository bookRepository) {
//        return new BookServiceImpl(bookRepository);
//    }
//
//    @Bean
//    public BookRepository bookRepository() {
//        return new BookRepository();
//    }
}
