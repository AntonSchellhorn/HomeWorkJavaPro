package com.telran.homework_160125.taskTwo;

import java.io.*;
import java.util.Scanner;

public class ExpressionReader {

    public static String readExpressionFromFile(String inputFile) {
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile))) {
            return reader.readLine();
        } catch (IOException e) {
            System.err.println("❌ Ошибка при чтении файла: " + e.getMessage());
            return null;
        }
    }

    public static String readExpressionFromConsole() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите математическое выражение: ");
        return scanner.nextLine();
    }
}
