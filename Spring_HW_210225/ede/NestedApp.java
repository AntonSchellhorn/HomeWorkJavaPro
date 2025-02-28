package org.telran.ede;

import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.cache.interceptor.BeanFactoryCacheOperationSourceAdvisor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.telran.ede.configuration.AppConfig;
import org.telran.ede.controller.BookController;
import org.telran.ede.model.Book;

import java.util.List;

/**
 * 1) ClassPathXmlApplicationContext + руками прописываем бины в файле настроек xml
 * <p>
 * 2) ClassPathXmlApplicationContext + в файле настроек пишем тег сканирования пакета и его
 * подпакетов + те классы, что нужно создать как бины, помечаем аннотацией @Component
 *
 * @Component -базовая аннотация для отметки класса как spring bean
 * @Service - аннотация для отметки классов с бизнес логикой как spring bean
 * (@Service == @Component) - внутри @Service находится @Component
 * @Controller - аннотация для отметки классов контроллеров как spring bean
 * (@Controller == @Component) - внутри @Controller находится @Component
 * @Repository - аннотация для отметки классов работающих с данными(БД)
 * (@Repository == @Component) - внутри @Repository находится @Component
 * <p>
 * Dependency Injection :
 * 1) Inject By Field
 * 2) Construction injection
 * 3) Setter injection
 * <p>
 * За инжект отвечает аннотация @Autowired
 * @Qualifier("bookServiceImpl") //уточнить какой бин сюда нужно подставить при инжекте
 * <p>
 * 3) Java config - конфигруация только на Java классах и аннотациях, без xml
 *    a) Автоматический поиск бинов через сканирование пакетов
 *    для просто Spring - нужно указать где искать ,
 *    например : new AnnotationConfigApplicationContext("org.telran.ede");
 *    тогда используем Component,Service,Repository,Controller над нужными классами
 *
 *    b) Самостоятельное указание файла конфигурации и описание бинов
 *    Класс конфигурации с анннотацией Configuration и внутри него методы
 *    с аннотацией @Bean где указвыаете классы, которые нужно создать
 *    в контекст спринга нужно передать имена класса или классов с конфигурацией
 *    например : new AnnotationConfigApplicationContext(AppConfig.class);
 *
 *    a) + b)
 *    Spring Boot(a + b)
 *
 *    @Configuration // указывает спрингу, что в этом классе прописываются настройки бинов
 *    внутри аннотации @Configuration содержится аннотация @Component, поэтому спринг успешно
 *    работает с этим классом
 */
@Configuration // указывает спрингу, что в этом классе прописываются настройки бинов
@ComponentScan(basePackages = "org.telran.ede")
public class NestedApp {

    public static void main(String[] args) {
//        BookRepository bookRepository = new BookRepository();
//        BookService bookService = new BookService(bookRepository);
//        BookController bookController = new BookController(bookService);

//        ConfigurableApplicationContext context =
//                new ClassPathXmlApplicationContext("annotationbeans.xml");
        ApplicationContext context = new AnnotationConfigApplicationContext(NestedApp.class);
        BookController bookController = context.getBean(BookController.class);
        List<Book> books = bookController.getBooks();
        System.out.println(books);

        //System.out.println(Arrays.toString(context.getBeanDefinitionNames()));
    }
}
