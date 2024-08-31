package de.telran.homeWorkJava_300824.task_1;
// класс щлга(Часть дома,композиция)
public class Window {
    private String type;

    // конструктор

    public Window(String type) {
        this.type = type;
    }

    // Метод для получения типа окна
    public String getType(){
        return type;
    }
}
