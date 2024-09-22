package de.telran.hWJ_200924.task_3;

import java.util.HashMap;
import java.util.Map;

public class FlightRoute {
    public static void main(String[] args) {
        Map<String, String> tickets = new HashMap<>();
        tickets.put("Berlin", "London");
        tickets.put("Tokyo", "Seoul");
        tickets.put("Mumbai", "Berlin");
        tickets.put("Seoul", "Mumbai");

        // Найти начальную точку маршрута
        String startCity = findStartCity(tickets);

        // Построить маршрут
        System.out.println("Маршрут:");
        while (startCity != null) {
            String destination = tickets.get(startCity);
            System.out.println(startCity + " -> " + destination);
            startCity = destination;
        }
    }

    public static String findStartCity(Map<String, String> tickets) {
        // Найти город, который не является пунктом назначения
        Map<String, Boolean> destinationCities = new HashMap<>();
        for (String destination : tickets.values()) {
            destinationCities.put(destination, true);
        }

        for (String city : tickets.keySet()) {
            if (!destinationCities.containsKey(city)) {
                return city;
            }
        }
        return null;
    }
}

