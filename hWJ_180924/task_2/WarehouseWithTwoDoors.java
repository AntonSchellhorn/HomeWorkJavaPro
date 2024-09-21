package de.telran.hWJ_180924.task_2;

import java.util.ArrayDeque;
import java.util.Deque;

public class WarehouseWithTwoDoors {
    public static void main(String[] args) {
        Deque<String> warehouse = new ArrayDeque<>();

        // Загрузка товара через одну дверь (с начала)
        warehouse.addFirst("Партия кирпичей 1");
        warehouse.addFirst("Партия кирпичей 2");
        warehouse.addFirst("Партия кирпичей 3");

        System.out.println("Склад загружен через одну дверь:");

        // Вывод состояния склада
        warehouse.forEach(System.out::println);

        // Отгрузка товара через вторую дверь (с конца)
        System.out.println("\nОтгрузка товара через вторую дверь:");
        while (!warehouse.isEmpty()) {
            System.out.println("Отгружается: " + warehouse.pollLast());
        }
    }
}
