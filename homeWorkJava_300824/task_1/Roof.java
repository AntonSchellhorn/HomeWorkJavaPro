package de.telran.homeWorkJava_300824.task_1;
// класс крыша(часть дома,композиция)
public class Roof {
    private String material;

    // Конструктор:

    public Roof(String material) {
        this.material = material;
    }

    // Метод для получения материала Крыши:
    public String getMaterial(){
        return material;
    }
}
