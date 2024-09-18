package de.telran.hWJ_060924.task_2;

import java.util.Random;

public class TwoDimensionalArrayOperations {
    public static void main(String[] args) {
        // Задаем размеры массива
        int M = 3;  // Число строк
        int N = 4;  // Число столбцов
        int[][] array = new int[M][N];

        // Создаем генератор случайных чисел
        Random random = new Random();

        // Заполняем массив случайными положительными числами (например, от 1 до 100)
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                array[i][j] = random.nextInt(100) + 1;  // Генерация числа от 1 до 100
            }
        }

        // Выводим все элементы массива на экран
        System.out.println("Двумерный массив:");
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        // Найти сумму всех элементов
        int sum = 0;
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                sum += array[i][j];
            }
        }
        System.out.println("Сумма всех элементов: " + sum);

        // Найти наименьший элемент
        int minElement = array[0][0];
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                if (array[i][j] < minElement) {
                    minElement = array[i][j];
                }
            }
        }
        System.out.println("Наименьший элемент: " + minElement);

        // Найти сумму квадратов всех элементов
        int sumOfSquares = 0;
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                sumOfSquares += array[i][j] * array[i][j];
            }
        }
        System.out.println("Сумма квадратов всех элементов: " + sumOfSquares);

        // Заменить все четные числа на их отрицательное значение
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                if (array[i][j] % 2 == 0) {
                    array[i][j] = -array[i][j];
                }
            }
        }

        // Выводим массив после изменения четных чисел
        System.out.println("Массив после замены четных чисел на отрицательные:");
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        // Найти второй по величине элемент
        int maxElement = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                if (array[i][j] > maxElement) {
                    secondMax = maxElement;
                    maxElement = array[i][j];
                } else if (array[i][j] > secondMax && array[i][j] != maxElement) {
                    secondMax = array[i][j];
                }
            }
        }
        System.out.println("Второй по величине элемент: " + secondMax);

        // Заменить дубликаты на 0
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                for (int k = i; k < M; k++) {
                    for (int l = (k == i ? j + 1 : 0); l < N; l++) {
                        if (array[i][j] == array[k][l] && array[i][j] != 0) {
                            array[k][l] = 0;
                        }
                    }
                }
            }
        }

        // Выводим массив после замены дубликатов на 0
        System.out.println("Массив после замены дубликатов на 0:");
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}

