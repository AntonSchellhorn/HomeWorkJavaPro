package de.telran.hWJ_090924.Task_3;


import java.util.ArrayList;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        // Шаг 1: Создание объектов Human
        ArrayList<Human> humans = new ArrayList<>();
        humans.add(new Human("John", 25, "Blue"));
        humans.add(new Human("Anna", 18, "Brown"));
        humans.add(new Human("Mike", 35, "Green"));
        humans.add(new Human("John", 25, "Blue"));  // Дублирующийся элемент

        // 1. Вывести всех людей на экран
        System.out.println("Все люди:");
        for (Human human : humans) {
            System.out.println(human);
        }

        // 2. Вывести людей с голубыми глазами
        System.out.println("\nЛюди с голубыми глазами:");
        for (Human human : humans) {
            if (human.eyeColor.equals("Blue")) {
                System.out.println(human);
            }
        }

        // 3. Удалить людей, чей возраст меньше 16 лет
        humans.removeIf(human -> human.age < 16);
        System.out.println("\nСписок после удаления людей младше 16 лет:");
        for (Human human : humans) {
            System.out.println(human);
        }

        // 4. Отфильтровать уникальные элементы (по имени)
        HashSet<String> uniqueNames = new HashSet<>();
        ArrayList<Human> uniqueHumans = new ArrayList<>();

        for (Human human : humans) {
            if (!uniqueNames.contains(human.name)) {
                uniqueNames.add(human.name);
                uniqueHumans.add(human);
            }
        }

        System.out.println("\nУникальные люди:");
        for (Human human : uniqueHumans) {
            System.out.println(human);
        }
    }
}

