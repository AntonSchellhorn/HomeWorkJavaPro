package com.telran.homework_160125.taskTwo;

import java.io.*;

public class ExpressionWriter {

    public static void writeExpressionToFile(String inputFile, String expression) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(inputFile))) {
            writer.write(expression);
        } catch (IOException e) {
            System.err.println("❌ Ошибка при записи в файл: " + e.getMessage());
        }
    }

    public static void writeResultToFile(String outputFile, double result) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {
            writer.write(Double.toString(result));
        } catch (IOException e) {
            System.err.println("❌ Ошибка при записи в файл результата: " + e.getMessage());
        }
    }
}
