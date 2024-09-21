package de.telran.hWJ_110924.task_2;

import java.util.LinkedHashSet;

public class HospitalQueue {
    public static void main(String[] args) {
        // LinkedHashSet сохраняет порядок добавления
        LinkedHashSet<String> liveQueue = new LinkedHashSet<>();

        // Люди приходят в очередь
        liveQueue.add("Иванов И.И.");
        liveQueue.add("Смирнов С.С.");
        liveQueue.add("Петров П.П.");
        liveQueue.add("Моргунов Н.И.");
        liveQueue.add("Васин В. В.");
        liveQueue.add("Стёпин С.С.");
        liveQueue.add("Андреев А.А.");

        // Выводим очередь
        System.out.println("Живая очередь: " + liveQueue);

        // Проверяем, кто первый в очереди
        System.out.println("Первый в очереди: " + liveQueue.iterator().next());
    }
}
