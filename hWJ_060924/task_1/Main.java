package de.telran.hWJ_060924.task_1;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // Задаем размер массива
        int M = 10;  // Например, размер массива 10 элементов
        int[] array = new int[M];

        // Создаем генератор случайных чисел
        Random random = new Random();

        // Заполняем массив случайными положительными числами (например, от 1 до 100)
        for (int i = 0; i < M; i++) {
            array[i] = random.nextInt(100) + 1;  // Генерация числа от 1 до 100
        }

        // Выводим все элементы массива на экран
        System.out.println("Массив:");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();


// Найти сумму всех элементов массива
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        System.out.println("Сумма всех элементов: " + sum);


// Найти наименьший элемент массива
        int min = array[0];  // Предположим, что первый элемент — минимальный
        for (int num : array) {
            if (num < min) {
                min = num;
            }
        }
        System.out.println("Наименьший элемент: " + min);


// Найти сумму квадратов всех элементов
        int sumOfSquares = 0;
        for (int num : array) {
            sumOfSquares += num * num;
        }
        System.out.println("Сумма квадратов всех элементов: " + sumOfSquares);


// Заменить все четные числа на их отрицательное значение
        for (int i = 0; i < M; i++) {
            if (array[i] % 2 == 0) {
                array[i] = -array[i];
            }
        }

        // Вывести массив после изменения
        System.out.println("Массив после замены четных чисел на отрицательные:");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();


// Найти второй по величине элемент
        int max = Integer.MIN_VALUE;  // Наибольший элемент
        int secondMax = Integer.MIN_VALUE;  // Второй по величине элемент

        for (int num : array) {
            if (num > max) {
                secondMax = max;  // Старое максимальное становится вторым
                max = num;  // Новое максимальное
            } else if (num > secondMax && num != max) {
                secondMax = num;
            }
        }
        System.out.println("Второй по величине элемент: " + secondMax);


        // Заменить дубликаты элементов на 0
        for (int i = 0; i < M; i++) {
            for (int j = i + 1; j < M; j++) {
                if (array[i] == array[j] && array[i] != 0) {
                    array[j] = 0;  // Заменяем дубликат на 0
                }
            }
        }

        // Вывести массив после удаления дубликатов
        System.out.println("Массив после замены дубликатов на 0:");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();

    }
}