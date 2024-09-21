package de.telran.hWJ_160924.task_1;

public class House {
    int area; // площадь дома
    int price; // цена
    String city; // город
    boolean hasFurniture; // продается с мебелью

    public House(int area, int price, String city, boolean hasFurniture) {
        this.area = area;
        this.price = price;
        this.city = city;
        this.hasFurniture = hasFurniture;
    }

    @Override
    public String toString() {
        return "Город: " + city + ", Площадь: " + area + " м², Цена: " + price + ", С мебелью: " + hasFurniture;
    }
}

