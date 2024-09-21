package de.telran.hWJ_180924.task_1;

import java.util.LinkedList;
import java.util.Queue;

public class Warehouse {
    public static void main(String[] args) {
        Queue<String> warehouse = new LinkedList<>();

        // Загрузка товара на склад
        warehouse.add("Партия кирпичей 1");
        warehouse.add("Партия кирпичей 2");
        warehouse.add("Партия кирпичей 3");

        System.out.println("Склад загружен:");

        // Вывод состояния склада
        warehouse.forEach(System.out::println);

        // Отгрузка товара (FIFO)
        System.out.println("\nОтгрузка товара:");
        while (!warehouse.isEmpty()) {
            System.out.println("Отгружается: " + warehouse.poll());
        }
    }
}
