package org.telran.ede.service; // Указываем, в каком пакете находится класс
/**
 * Код конечно написан с помощью "Джи". Но по другому я не смог бы, я его переписал сам,и что бы каждый шаг
 * мне был более понятен я попросил прокомментировать каждое действие. Так мне понятен каждый шаг и со временем,
 * мне хочется верить, что всё осядет по полочкам в голове.Раз 500 наверное надо каждую тему ручками набрать...
 */

import org.springframework.beans.factory.annotation.Autowired; // Импортируем аннотацию для автоматического связывания зависимостей
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service; // Импортируем аннотацию, чтобы Spring знал, что этот класс — сервисный слой
import org.telran.ede.model.Book; // Импортируем модель Book, с которой будем работать
import org.telran.ede.repository.BookRepository; // Импортируем основной репозиторий книг
import org.telran.ede.repository.OldBookRepository; // Импортируем репозиторий старых книг

import java.util.List; // Импортируем список, так как метод будет возвращать список книг
import java.util.stream.Collectors; // Импортируем Collectors для преобразования потока в список
import java.util.stream.Stream; // Импортируем Stream для объединения потоков данных

@Primary
// Помечаем этот класс как сервисный компонент Spring
@Service
public class BookServiceImpl implements BookService {

    // Создаём два поля, которые будут хранить ссылки на репозитории
    private final BookRepository bookRepository; // Репозиторий с новыми книгами
    private final OldBookRepository oldBookRepository; // Репозиторий со старыми книгами

    // Используем конструктор для внедрения зависимостей
    @Autowired // Аннотация говорит Spring: "Передай сюда нужные бины при создании объекта"
    public BookServiceImpl(BookRepository bookRepository, OldBookRepository oldBookRepository) {
        this.bookRepository = bookRepository; // Присваиваем переданный BookRepository
        this.oldBookRepository = oldBookRepository; // Присваиваем переданный OldBookRepository
    }

    // Метод, который получает все книги: и новые, и старые
    @Override
    public List<Book> getAllBooks() {
        // Используем Stream API для объединения двух списков в один
        return Stream.concat( // Метод concat объединяет два потока данных в один
                bookRepository.getBooks().stream(), // Преобразуем список новых книг в поток
                oldBookRepository.getOldBooks().stream() // Преобразуем список старых книг в поток
        ).collect(Collectors.toList()); // Собираем объединённый поток обратно в список
    }
}
