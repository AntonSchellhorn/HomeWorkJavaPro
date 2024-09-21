package de.telran.hWJ_180924.task_3;

import java.util.Comparator;
import java.util.PriorityQueue;

public class GasStation {

    public static void main(String[] args) {
        // Comparator для приоритетов
        Comparator<Vehicle> priorityComparator = (v1, v2) -> Integer.compare(v1.currentPriority, v2.currentPriority);

        // Очередь с приоритетом
        PriorityQueue<Vehicle> gasQueue = new PriorityQueue<>(priorityComparator);

        // Добавляем транспорт в очередь с базовыми приоритетами
        Vehicle ambulance = new Vehicle("Скорая помощь", 1);
        Vehicle bus = new Vehicle("Автобус", 3);
        Vehicle car = new Vehicle("Обычный автомобиль", 4);
        Vehicle cityService = new Vehicle("Технологический транспорт", 2);

        gasQueue.add(ambulance);
        gasQueue.add(bus);
        gasQueue.add(car);
        gasQueue.add(cityService);

        // Условие: обычное время
        System.out.println("Обычное время:");
        updatePriorities(gasQueue, false, false); // Не часы пик и нет снегопада

        // Условие: часы пик
        System.out.println("\nЧасы пик:");
        updatePriorities(gasQueue, true, false); // Часы пик, но нет снегопада

        // Условие: снегопад
        System.out.println("\nСнегопад:");
        updatePriorities(gasQueue, false, true); // Не часы пик, но снегопад
    }

    // Метод для обновления приоритетов в зависимости от условий
    public static void updatePriorities(PriorityQueue<Vehicle> gasQueue, boolean isRushHour, boolean isBadWeather) {
        for (Vehicle vehicle : gasQueue) {
            if (isBadWeather) {
                // Во время снегопада приоритет у технологического транспорта
                if (vehicle.type.equals("Технологический транспорт")) {
                    vehicle.currentPriority = 1;
                } else if (vehicle.type.equals("Скорая помощь")) {
                    vehicle.currentPriority = 2;
                } else if (vehicle.type.equals("Автобус")) {
                    vehicle.currentPriority = 3;
                } else {
                    vehicle.currentPriority = 4; // Остальные имеют самый низкий приоритет
                }
            } else if (isRushHour) {
                // В часы пик приоритет у скорой и автобусов
                if (vehicle.type.equals("Скорая помощь")) {
                    vehicle.currentPriority = 1;
                } else if (vehicle.type.equals("Автобус")) {
                    vehicle.currentPriority = 2;
                } else {
                    vehicle.currentPriority = 3; // Остальные
                }
            } else {
                // В обычное время приоритет только у скорой
                if (vehicle.type.equals("Скорая помощь")) {
                    vehicle.currentPriority = 1;
                } else {
                    vehicle.currentPriority = 3; // Все остальные с одинаковым более низким приоритетом
                }
            }
        }

        // Выводим очередь с новыми приоритетами
        PriorityQueue<Vehicle> updatedQueue = new PriorityQueue<>(gasQueue);
        while (!updatedQueue.isEmpty()) {
            System.out.println(updatedQueue.poll());
        }
    }
}