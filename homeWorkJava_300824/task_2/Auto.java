package de.telran.homeWorkJava_300824.task_2;
// Общий класс Авто, который будет базовым для всех автомобилей
public class Auto {
    private String model;
    private String engine;

    public Auto(String model, String engine) {
        this.model = model;
        this.engine = engine;
    }

    //Метод для получения информации о модели
    public String getModel(){
        return model;
    }

    //Метод для получения информации о двигателе
    public String getEngine(){
        return engine;
    }

    //Метод для старта двигателя
    public void startEngine(){
        System.out.println("Двигатель " + model + " запущен! ");
    }
}





