package de.telran.hWJ_160924.task_2;

import java.util.TreeSet;

public class Bank {
    public static void main(String[] args) {
        TreeSet<Ticket> queue = new TreeSet<>();

        // Добавляем клиентов в очередь
        queue.add(new Ticket("Иванов И.И.", 1985, "Открытие депозита", 5));
        queue.add(new Ticket("Петров П.П.", 1990, "Консультация", 2));
        queue.add(new Ticket("Сидоров С.С.", 1975, "Получение денежных средств", 3));
        queue.add(new Ticket("Фролов И.И.",1999,"Коммунальные платежи",8));
        queue.add(new Ticket("Максимов М.М.",1998,"Денежный перевод",4));
        // Выводим очередь по талонам
        System.out.println("Очередь на обслуживание:");
        for (Ticket ticket : queue) {
            System.out.println(ticket);
        }
    }
}
