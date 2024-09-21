package de.telran.hWJ_160924.task_1;

import java.util.Comparator;

public class CityAndAreaComparator implements Comparator<House> {
    @Override
    public int compare(House h1, House h2) {
        int cityComparison = h1.city.compareTo(h2.city); // Сначала сравниваем города
        if (cityComparison == 0) {
            return Integer.compare(h1.area, h2.area); // Если города одинаковы, сравниваем по площади
        }
        return cityComparison; // Иначе сортируем по городу
    }
}

