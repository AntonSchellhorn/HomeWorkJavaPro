package com.telran.homework_160125.taskTwo;

import java.io.File;
import java.util.List;

public class Calculator {

    public static void main(String[] args) {
        String folderPath = "src/main/java/com/telran/homework_160125/taskTwo/resources/";
        new File(folderPath).mkdirs();

        String inputFile = folderPath + "input.txt";
        String outputFile = folderPath + "output.txt";

        // 1️⃣ Ввод выражения (из консоли)
        String expression = ExpressionReader.readExpressionFromConsole();

        // 2️⃣ Запись выражения в файл
        ExpressionWriter.writeExpressionToFile(inputFile, expression);
        System.out.println("✅ Выражение записано в файл: " + inputFile);

        // 3️⃣ Чтение из файла и вычисление результата
        String readExpression = ExpressionReader.readExpressionFromFile(inputFile);
        if (readExpression == null) {
            return;
        }
        List<String> rpn = ExpressionEvaluator.convertToRPN(readExpression);
        double result = ExpressionEvaluator.evaluateRPN(rpn);

        // 4️⃣ Запись результата в файл
        ExpressionWriter.writeResultToFile(outputFile, result);
        System.out.println("📌 Результат вычисления: " + result);
    }
}
