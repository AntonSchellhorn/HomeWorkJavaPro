package de.telran.hWJ_200924.task_2;

import java.util.Map;
import java.util.TreeMap;

public class CatShelter {
    public static void main(String[] args) {
        Map<String, Cat> cats = new TreeMap<>(); // TreeMap хранит имена котов в отсортированном виде
        cats.put("Мурзик", new Cat("Мурзик", 3, 5.5, "Сиамская"));
        cats.put("Барсик", new Cat("Барсик", 4, 6.0, "Британская"));
        cats.put("Снежок", new Cat("Снежок", 2, 4.0, "Сиамская"));
        cats.put("Котик", new Cat("Котик", 5, 7.0, "Британская"));

        // Вывод котов по породе N (например, "Сиамская")
        String breedToFind = "Сиамская";
        System.out.println("Коты породы " + breedToFind + ":");
        for (Cat cat : cats.values()) {
            if (cat.breed.equals(breedToFind)) {
                System.out.println(cat);
            }
        }

        // Вывод котов с весом больше значения М (например, 5.0)
        double weightLimit = 5.0;
        System.out.println("\nКоты с весом больше " + weightLimit + " кг:");
        for (Cat cat : cats.values()) {
            if (cat.weight > weightLimit) {
                System.out.println(cat);
            }
        }

        // Найти кота с самым большим весом и возрастом одновременно
        Cat biggestCat = null;
        for (Cat cat : cats.values()) {
            if (biggestCat == null || (cat.weight > biggestCat.weight && cat.age > biggestCat.age)) {
                biggestCat = cat;
            }
        }
        System.out.println("\nКот с самым большим весом и возрастом одновременно: " + biggestCat);
    }
}

