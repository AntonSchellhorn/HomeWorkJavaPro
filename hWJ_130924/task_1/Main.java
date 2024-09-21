package de.telran.hWJ_130924.task_1;

import java.util.ArrayList;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        // Создаём ArrayList объектов класса Human
        ArrayList<Human> humans = new ArrayList<>();
        humans.add(new Human("Иван", "голубой", 25));
        humans.add(new Human("Мария", "зелёный", 30));
        humans.add(new Human("Анна", "коричневый", 15));
        humans.add(new Human("Юлия", "серый", 23));
        humans.add(new Human("Мария", "голубой", 20));
        humans.add(new Human("Асхат", "чёрный", 30));
        humans.add(new Human("Максим", "зелёный", 21));

        // Выводим всех людей
        System.out.println("Все люди:");
        for (Human human : humans) {
            System.out.println(human);
        }

        // Выводим людей с голубыми глазами
        System.out.println("\nЛюди с голубыми глазами:");
        for (Human human : humans) {
            if (human.eyeColor.equals("голубой")) {
                System.out.println(human);
            }
        }

        // Удаляем людей младше 16 лет
        humans.removeIf(human -> human.age < 16);

        // Выводим оставшихся людей
        System.out.println("\nПосле удаления людей младше 16:");
        for (Human human : humans) {
            System.out.println(human);
        }
        // Используем HashSet для фильтрации уникальных объектов
        HashSet<Human> uniqueHumans = new HashSet<>(humans);

        // Выводим уникальных людей
        System.out.println("\nУникальные люди:");
        for (Human human : uniqueHumans) {
            System.out.println(human);
        }


    }
}



