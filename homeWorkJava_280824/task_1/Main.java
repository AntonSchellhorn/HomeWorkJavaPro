package de.telran.homeWorkJava_280824.task_1;

public class Main {
    public static void main(String[] args) {
        System.out.println("Среднее двух целых чисел (3, 7): " + MathUtils.avg(3, 7));
        System.out.println("Максимум двух дробных чисел (3.5, 7.8): " + MathUtils.max(3.5, 7.8));
        System.out.println("Минимум массива целых чисел {1, 2, 3, 4, 5}: " + MathUtils.min(new int[]{1, 2, 3, 4, 5}));
    }
}
