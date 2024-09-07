package de.telran.hWJ_040924.task_1;
// Обобщенный интерфейс для калькулятора
public interface Calculator<T>{

    // Метод для сложения
    T add(T a, T b);
    // Метод для вычитания
    T sub(T a, T b);
    // Метод для умножения
    T multi(T a, T b);
    // Метод для деления
    T div(T a, T b);
}
