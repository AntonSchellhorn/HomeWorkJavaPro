package de.telran.hWJ_160924.task_1;

import java.util.Comparator;

public class PriceComparator implements Comparator<House> {
    @Override
    public int compare(House h1, House h2) {
        return Integer.compare(h1.price, h2.price); // Сортировка по возрастанию цены
    }
}
