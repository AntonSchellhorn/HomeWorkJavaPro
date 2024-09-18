package de.telran.hWJ_060924.task_3;

import java.util.Random;

public class ThreeDimensionalArrayOperations {
    public static void main(String[] args) {
        // Размеры массива
        int M = 3;  // Количество строк
        int N = 4;  // Количество столбцов
        int Z = 2;  // Глубина (количество "слоев")

        // Инициализируем трехмерный массив размером MxNxZ
        int[][][] array = new int[M][N][Z];

        // Создаем генератор случайных чисел для заполнения массива
        Random random = new Random();

        // Заполняем массив случайными положительными числами (от 1 до 100)
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                for (int k = 0; k < Z; k++) {
                    array[i][j][k] = random.nextInt(100) + 1;  // Генерация числа от 1 до 100
                }
            }
        }

        // 1. Выводим все элементы массива на экран
        System.out.println("Трехмерный массив:");
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                for (int k = 0; k < Z; k++) {
                    System.out.print(array[i][j][k] + " ");
                }
                System.out.println();  // Переход на новую строку после каждой "строки" массива
            }
            System.out.println();  // Разделение слоев массива для удобства чтения
        }

        // 2. Найти сумму всех элементов массива
        int sum = 0;
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                for (int k = 0; k < Z; k++) {
                    sum += array[i][j][k];  // Добавляем каждый элемент к общей сумме
                }
            }
        }
        System.out.println("Сумма всех элементов: " + sum);

        // 3. Найти наименьший элемент массива
        int minElement = array[0][0][0];  // Начинаем с первого элемента
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                for (int k = 0; k < Z; k++) {
                    if (array[i][j][k] < minElement) {
                        minElement = array[i][j][k];  // Обновляем минимальный элемент
                    }
                }
            }
        }
        System.out.println("Наименьший элемент: " + minElement);

        // 4. Найти сумму квадратов всех элементов массива
        int sumOfSquares = 0;
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                for (int k = 0; k < Z; k++) {
                    sumOfSquares += array[i][j][k] * array[i][j][k];  // Добавляем квадрат каждого элемента
                }
            }
        }
        System.out.println("Сумма квадратов всех элементов: " + sumOfSquares);

        // 5. Заменить все четные числа на их отрицательные значения
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                for (int k = 0; k < Z; k++) {
                    if (array[i][j][k] % 2 == 0) {  // Если число четное
                        array[i][j][k] = -array[i][j][k];  // Делаем его отрицательным
                    }
                }
            }
        }

        // Выводим массив после замены четных чисел на отрицательные
        System.out.println("Массив после замены четных чисел на отрицательные:");
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                for (int k = 0; k < Z; k++) {
                    System.out.print(array[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }

        // 6. Найти второй по величине элемент массива
        int maxElement = Integer.MIN_VALUE;  // Максимальный элемент
        int secondMax = Integer.MIN_VALUE;  // Второй по величине элемент

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                for (int k = 0; k < Z; k++) {
                    if (array[i][j][k] > maxElement) {
                        secondMax = maxElement;  // Предыдущий максимум становится вторым
                        maxElement = array[i][j][k];  // Обновляем максимальный элемент
                    } else if (array[i][j][k] > secondMax && array[i][j][k] != maxElement) {
                        secondMax = array[i][j][k];  // Обновляем второй по величине элемент
                    }
                }
            }
        }
        System.out.println("Второй по величине элемент: " + secondMax);

        // 7. Заменить все дубликаты элементов на 0
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                for (int k = 0; k < Z; k++) {
                    for (int x = i; x < M; x++) {
                        for (int y = (x == i ? j : 0); y < N; y++) {
                            for (int z = (x == i && y == j ? k + 1 : 0); z < Z; z++) {
                                if (array[i][j][k] == array[x][y][z]) {
                                    array[x][y][z] = 0;  // Заменяем дубликаты на 0
                                }
                            }
                        }
                    }
                }
            }
        }

        // Выводим массив после замены дубликатов на 0
        System.out.println("Массив после замены дубликатов на 0:");
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                for (int k = 0; k < Z; k++) {
                    System.out.print(array[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}

