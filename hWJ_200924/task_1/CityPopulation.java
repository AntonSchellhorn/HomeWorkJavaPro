package de.telran.hWJ_200924.task_1;

import java.util.HashMap;
import java.util.Map;

public class CityPopulation {
    public static void main(String[] args) {
        Map<String, Integer> cityPopulation = new HashMap<>();
        cityPopulation.put("Москва", 12500000);
        cityPopulation.put("Санкт-Петербург", 5380000);
        cityPopulation.put("Казань", 1250000);
        cityPopulation.put("Новосибирск", 1620000);

        // Найти город с самым большим количеством жителей
        String largestCity = null;
        int maxPopulation = 0;
        for (Map.Entry<String, Integer> entry : cityPopulation.entrySet()) {
            if (entry.getValue() > maxPopulation) {
                maxPopulation = entry.getValue();
                largestCity = entry.getKey();
            }
        }
        System.out.println("Город с самым большим количеством жителей: " + largestCity + ", Население: " + maxPopulation);

        // Найти среднее количество жителей
        int totalPopulation = 0;
        for (int population : cityPopulation.values()) {
            totalPopulation += population;
        }
        double averagePopulation = (double) totalPopulation / cityPopulation.size();
        System.out.println("Среднее количество жителей: " + averagePopulation);

        // Найти все города с одинаковым количеством жителей
        Map<Integer, String> populationGroups = new HashMap<>();
        for (Map.Entry<String, Integer> entry : cityPopulation.entrySet()) {
            if (populationGroups.containsKey(entry.getValue())) {
                System.out.println("Города с одинаковым населением: " + populationGroups.get(entry.getValue()) + " и " + entry.getKey());
            } else {
                populationGroups.put(entry.getValue(), entry.getKey());
            }
        }
    }
}
