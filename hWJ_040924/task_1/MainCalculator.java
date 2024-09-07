package de.telran.hWJ_040924.task_1;

import java.util.Scanner;

public class MainCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        IntegerCalculator calculator = new IntegerCalculator();

        boolean continueCalculators = true; // флаг для продолжения вычисления

     while (continueCalculators){
         // Вводим первое число
         System.out.println("Введите первое число: ");
         int a = scanner.nextInt();

         // Вводим операцию
         System.out.println("Введите операцию (+, -, *, /): ");
         String operation = scanner.next();

         // Вводим второе число
         System.out.println("Введите второе число: ");
         int b = scanner.nextInt();

         // Выполняем операцию в зависимости от ввода
         switch (operation){
             case "+":
                 System.out.println("Результат сложения: " + calculator.add(a,b));
                 break;
             case "-":
                 System.out.println("Результат вычитания: " + calculator.sub(a,b));
                 break;
             case "*":
                 System.out.println("Результат умножения: " + calculator.multi(a,b));
                 break;
             case "/":
                 try{
                 System.out.println("Результат деления: " + calculator.div(a,b));
                 } catch (ArithmeticException e){
                     System.out.println("Ошибка: " + e.getMessage());

                 }
                 break;
             default:
                 System.out.println("Некорректная операция! Пожалуйста, введите +, -, *, или /.");
         }

         // Спрашиваем у пользователя, хочет ли он продолжить
         System.out.println("Хотите продолжить вычисления? (да/нет): ");
         String answer = scanner.next();

         // Если ответ "нет", прекращаем работу программы
         if (answer.equalsIgnoreCase("нет")){
             continueCalculators = false;
         }

        }

        System.out.println("Программа завершена.");
    }
}
