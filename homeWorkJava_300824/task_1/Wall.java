package de.telran.homeWorkJava_300824.task_1;
// класс стены (часть дома,композиция)
public class Wall {
    private String material;

    // конструктор

    public Wall(String material) {
        this.material = material;
    }

    // Метод для получения материала стен
    public String getMaterial(){
        return material;
    }
}
