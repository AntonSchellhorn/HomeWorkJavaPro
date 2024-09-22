package de.telran.hWJ_200924.task_4;

import java.util.*;

public class GroupWords {
    public static void main(String[] args) {
        String[] words = {"student", "students", "dog", "god", "cat", "act", "flow", "wolf"};
        Map<String, List<String>> groupedWords = new HashMap<>();

        for (String word : words) {
            char[] charArray = word.toCharArray();
            Arrays.sort(charArray); // Сортируем символы в слове
            String key = new String(charArray);

            // Добавляем слово в группу с одинаковым набором символов
            groupedWords.computeIfAbsent(key, k -> new ArrayList<>()).add(word);
        }

        // Выводим сгруппированные слова
        for (List<String> group : groupedWords.values()) {
            System.out.println(group);
        }
    }
}

