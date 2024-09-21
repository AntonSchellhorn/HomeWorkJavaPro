package de.telran.hWJ_130924.task_3;

import java.util.LinkedHashSet;

public class Main {
    public static void main(String[] args) {
        LinkedHashSet<Order> orders = new LinkedHashSet<>();

        // Добавляем заказы
        orders.add(new Order("Паста", 1));
        orders.add(new Order("Салат", 2));
        orders.add(new Order("Пицца", 3));

        // Выводим заказы в порядке их поступления
        System.out.println("\nЗаказы на кухне:");
        for (Order order : orders) {
            System.out.println(order);
        }

        // Пример: повар берёт первый заказ (LinkedHashSet сохраняет порядок добавления)
        System.out.println("\nПовар взял первый заказ: " + orders.iterator().next());
    }
}
