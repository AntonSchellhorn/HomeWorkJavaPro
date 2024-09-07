package de.telran.hWJ_040924.task_3;

public class MainBox {
    public static void main(String[] args) {
        // Создаем коробку с габаритами 10x15x20
        Box<String> box = new Box<>(10, 15, 20);

        // Пытаемся поместить объект в коробку

        if (box.canFit(5, 10, 12)) {
            box.setContent("Книга"); // Помещаем книгу в коробку
            System.out.println("Книга помещена в коробку.");
        } else {
            System.out.println("Объект не подходит по габаритам.");
        }
        // Отправляем коробку
        box.send();

        // Получаем коробку
        box.receive();
    }
}
