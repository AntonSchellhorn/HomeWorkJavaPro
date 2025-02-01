package com.telran.homework_160125.taskTwo;

import java.util.*;

public class ExpressionEvaluator {

    public static List<String> convertToRPN(String expression) {
        Map<Character, Integer> precedence = Map.of(
                '+', 1, '-', 1, '*', 2, '/', 2
        );

        List<String> output = new ArrayList<>();
        Deque<Character> operators = new ArrayDeque<>();

        StringBuilder number = new StringBuilder();
        for (char c : expression.toCharArray()) {
            if (Character.isDigit(c) || c == '.') {
                number.append(c);
            } else {
                if (number.length() > 0) {
                    output.add(number.toString());
                    number.setLength(0);
                }
                if (c == '(') {
                    operators.push(c);
                } else if (c == ')') {
                    while (!operators.isEmpty() && operators.peek() != '(') {
                        output.add(Character.toString(operators.pop()));
                    }
                    operators.pop(); // Убираем '('
                } else if (precedence.containsKey(c)) {
                    while (!operators.isEmpty() && precedence.getOrDefault(operators.peek(), 0) >= precedence.get(c)) {
                        output.add(Character.toString(operators.pop()));
                    }
                    operators.push(c);
                }
            }
        }
        if (number.length() > 0) {
            output.add(number.toString());
        }
        while (!operators.isEmpty()) {
            output.add(Character.toString(operators.pop()));
        }
        return output;
    }

    public static double evaluateRPN(List<String> rpn) {
        Deque<Double> stack = new ArrayDeque<>();

        for (String token : rpn) {
            if (token.matches("-?\\d+(\\.\\d+)?")) { // Число
                stack.push(Double.parseDouble(token));
            } else { // Операция
                double b = stack.pop();
                double a = stack.pop();
                switch (token) {
                    case "+" -> stack.push(a + b);
                    case "-" -> stack.push(a - b);
                    case "*" -> stack.push(a * b);
                    case "/" -> stack.push(a / b);
                }
            }
        }
        return stack.pop();
    }
}
