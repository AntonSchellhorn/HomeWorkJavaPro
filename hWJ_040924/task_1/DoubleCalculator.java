package de.telran.hWJ_040924.task_1;
// Класс для работы с вещественными числами, реализующий интерфейс Calculator
public class DoubleCalculator implements Calculator <Double> {
    // Реализация метода сложения
    @Override
    public Double add(Double a, Double b) {
        return a + b;
    }
    // Реализация метода вычитания
    @Override
    public Double sub(Double a, Double b) {
        return a - b;
    }
    // Реализация метода умножения
    @Override
    public Double multi(Double a, Double b) {
        return a * b;
    }
    // Реализация метода деления
    @Override
    public Double div(Double a, Double b) {
        // Проверяем, чтобы делитель не был равен нулю
        if (b == 0){
            throw new ArithmeticException("Операция невозможна!");
            }
        return a / b;
    }
}
