package de.telran.hWJ_130924.task_2;

import java.util.TreeSet;


public class Main {
    public static void main(String[] args) {
        TreeSet<Ticket> bankQueue = new TreeSet<>();

        // Добавляем людей в очередь
        bankQueue.add(new Ticket("Иванов И.И.", 1985, "Открытие депозита", 10));
        bankQueue.add(new Ticket("Петров П.П.", 1990, "Консультация", 5));
        bankQueue.add(new Ticket("Сидоров С.С.", 1975, "Получение денежных средств", 7));

        // Выводим очередь по талонам
        System.out.println("\nОчередь в банке:");
        for (Ticket ticket : bankQueue) {
            System.out.println(ticket);
        }
    }
}
