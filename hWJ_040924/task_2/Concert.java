package de.telran.hWJ_040924.task_2;
// Класс концерта, принимающий артистов любого жанра
public class Concert<T extends Artist>{

    private T artist; // Объект артиста

    // Конструктор, принимающий артиста на сцену


    public Concert(T artist) {
        this.artist = artist;
    }

    // Метод для проведения концерта, вызывающий выступление артиста
    public void startConcert(){
        System.out.println("Концерт начинается!");
        artist.perform(); // Артист выступает
        System.out.println("Концерт завершен.");
    }

    public void close() {

    }
}
