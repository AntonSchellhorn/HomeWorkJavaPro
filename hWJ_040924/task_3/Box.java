package de.telran.hWJ_040924.task_3;
// Generic-класс для коробки, которая может хранить объекты любого типа
public class Box <T> {
    public T receive;
    // Поля для хранения габаритов коробки
    private double height;  // высота
    private double length;  // длина
    private double width;   // ширина
    private T content;      // содержимое коробки

    // Конструктор для инициализации коробки с габаритами


    public Box(double height, double length, double width) {
        this.height = height;
        this.length = length;
        this.width = width;
    }
    // Метод для добавления объекта в коробку


    public void setContent(T content) {
        this.content = content;
    }

    // Метод для получения содержимого коробки
    public T getContent() {
        return content;
    }

    // Метод для проверки, влезает ли объект в коробку по габаритам

    public boolean canFit(double objectHeight,double objectLength,double objectWidth){
        return objectHeight <= height && objectLength <= length && objectWidth <= width;
    }
    // Метод для отправки коробки
    public void send(){
        if (content != null){
            System.out.println("Коробка отправлена с содержимым: " + content.toString());
        }else {
            System.out.println("Коробка пуста!");
        }
    }
     // Метод для получения коробки
    public void receive() {
        if(content != null){
            System.out.println("Коробка получена. Содержимое: " + content.toString());
        }else {
            System.out.println("Коробка пуста при получении.");
        }
    }
}
