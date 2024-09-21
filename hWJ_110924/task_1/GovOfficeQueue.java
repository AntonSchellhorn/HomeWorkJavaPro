package de.telran.hWJ_110924.task_1;

import java.util.TreeSet;

public class GovOfficeQueue {
    public static void main(String[] args) {
        // TreeSet автоматически сортирует элементы по возрастанию
        TreeSet<Integer> queueNumbers = new TreeSet<>();

        // Регистрируем посетителей с номерами
        queueNumbers.add(25);
        queueNumbers.add(10);
        queueNumbers.add(5);
        queueNumbers.add(30);

        // Выводим номера в порядке возрастания
        System.out.println("Очередь по талонам: " + queueNumbers);

        // Проверяем первого в очереди
        System.out.println("Первый в очереди: " + queueNumbers.first());

        // Проверяем последнего в очереди
        System.out.println("Последний в очереди: " + queueNumbers.last());
    }
}

