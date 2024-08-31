package de.telran.homeWorkJava_300824.task_1;
//класс двери (часть дома ,композиция)
public class Door {
    private String material;

    // конструктор

    public Door(String material) {
        this.material = material;
    }

    //Метод для получения материала дверей
    public String getMaterial(){
        return material;
    }
}
