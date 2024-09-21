package de.telran.hWJ_160924.task_1;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<House> houses = new ArrayList<>();
        houses.add(new House(120, 200000, "Москва", true));
        houses.add(new House(80, 150000, "Санкт-Петербург", false));
        houses.add(new House(100, 250000, "Москва", true));
        houses.add(new House(90, 180000, "Санкт-Петербург", false));

        // Сортировка по цене
        System.out.println("Сортировка по цене:");
        Collections.sort(houses, new PriceComparator());
        houses.forEach(System.out::println);

        // Сортировка по городу и цене
        System.out.println("\nСортировка по городу и цене:");
        Collections.sort(houses, new CityAndPriceComparator());
        houses.forEach(System.out::println);

        // Сортировка по городу и площади
        System.out.println("\nСортировка по городу и площади:");
        Collections.sort(houses, new CityAndAreaComparator());
        houses.forEach(System.out::println);
    }
}

