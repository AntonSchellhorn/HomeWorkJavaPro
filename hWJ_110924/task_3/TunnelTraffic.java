package de.telran.hWJ_110924.task_3;

import java.util.concurrent.ConcurrentSkipListSet;

public class TunnelTraffic {
    public static void main(String[] args) {
        // ConcurrentSkipListSet для потоко-безопасности и сортировки
        ConcurrentSkipListSet<String> carsInTunnel = new ConcurrentSkipListSet<>();

        // Добавляем машины, которые въезжают в туннель
        carsInTunnel.add("Car1");
        carsInTunnel.add("Car6");
        carsInTunnel.add("Car4");
        carsInTunnel.add("Car5");
        carsInTunnel.add("Car2");
        carsInTunnel.add("Car3");
        carsInTunnel.add("Car7");

        // Выводим количество машин в туннеле
        System.out.println("Количество машин в туннеле: " + carsInTunnel.size());

        // Выводим все машины
        System.out.println("Машины в туннеле: " + carsInTunnel);
    }
}

