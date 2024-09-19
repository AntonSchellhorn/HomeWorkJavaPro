package de.telran.hWJ_090924.Task_1_2;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        // Добавляем элементы в список
        list.add(5);
        list.add(10);
        list.add(15);
        list.add(20);

        // Найти сумму всех элементов
        int sum = 0;
        for (int num : list) {
            sum += num;
        }
        System.out.println("Сумма всех элементов: " + sum);

        // Найти среднее значение
        double average = (double) sum / list.size();
        System.out.println("Среднее значение: " + average);

        //найти меньший элемент
        int min = list.get(0);
        for (int num : list) {
            if (num < min) {
                min = num;
            }
        }
        System.out.println("Наименьший элемент: " + min);

        //найти суму квадратов элементов

        int sumOfSquares = 0;
        for (int num : list) {
            sumOfSquares += num * num;
        }
        System.out.println("Сумма квадратов: " + sumOfSquares);


        //Удалить все четные числа из ArrayList

        list.removeIf(num -> num % 2 == 0);
        System.out.println("Список после удаления четных чисел: " + list);

        //найти второй по величине элемент

        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int num : list) {
            if (num > max) {
                secondMax = max;
                max = num;
            } else if (num > secondMax && num != max) {
                secondMax = num;
            }
        }
        System.out.println("Второй по величине элемент: " + secondMax);


        //Task_2
        //Найти наибольший элемент в LinkedList



        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(3);
        linkedList.add(7);
        linkedList.add(1);
        linkedList.add(9);

        int maxElement = linkedList.get(0);
        for (int num : linkedList) {
            if (num > maxElement) {
                maxElement = num;
            }
        }
        System.out.println("Наибольший элемент: " + maxElement);

        //Заменить все элементы, кратные 3, на нули

        for (int i = 0; i < linkedList.size(); i++) {
            if (linkedList.get(i) % 3 == 0) {
                linkedList.set(i, 0);
            }
        }
        System.out.println("После замены кратных 3 на нули: " + linkedList);

        //Вычислить произведение всех элементов

        int product = 1;
        for (int num : linkedList) {
            product *= num;
        }
        System.out.println("Произведение всех элементов: " + product);


    }
}

