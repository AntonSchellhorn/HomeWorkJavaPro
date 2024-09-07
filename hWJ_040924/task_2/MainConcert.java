package de.telran.hWJ_040924.task_2;

import java.util.Scanner;

public class MainConcert {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите артиста для концерта: 1 - Певец, 2 - Танцор, 3 - Клоун");
        int choice = scanner.nextInt();

        Concert<? extends Artist> concert; // Концерт с любым артистом

        switch (choice) {
            case 1:
                concert = new Concert<>(new Singer());// Концерт с певцом
                break;
            case 2:
                concert = new Concert<>(new Dancer());// Концерт с танцором
                break;
            case 3:
                concert = new Concert<>(new Clown());// Концерт с клоуном
                break;
            default:
                System.out.println("Некорректный выбор.");
                return;
        }
        concert.startConcert();// Запуск концерта
        concert.close();


    }
}
