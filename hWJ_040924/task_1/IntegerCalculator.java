package de.telran.hWJ_040924.task_1;

public class IntegerCalculator implements Calculator <Integer>{

    // Реализация метода сложения
    @Override
    public Integer add(Integer a, Integer b) {
        return a + b;
    }

    // Реализация метода вычитания
    @Override
    public Integer sub(Integer a, Integer b) {
        return a - b;
    }

    // Реализация метода умножения
    @Override
    public Integer multi(Integer a, Integer b) {
        return a * b;
    }

    // Реализация метода деления
    @Override
    public Integer div(Integer a, Integer b) {

        // Проверяем, чтобы делитель не был равен нулю
        if (b == 0){
            throw new ArithmeticException("Операция невозможна!");
        }
        return a / b;
    }
}
