package de.telran.homeWorkJava_280824.task_3;

public class Car implements Driver,Mechanic{
    private String model;  // Модель автомобиля
    private String engine; // Двигатель автомобиля

    public Car(String model, String engine) {
        this.model = model;
        this.engine = engine;
    }

    @Override
    public void drive() {
        System.out.println("Вождение автомобиля модели: " + model);
    }

    @Override
    public void refuel() {
        System.out.println("Заправка автомобиля модели: " + model);
    }

    @Override
    public void changeOil() {
        System.out.println("Замена масла в автомобиле модели: " + model);
    }

    @Override
    public void checkEngine() {
        System.out.println("Проверка двигателя автомобиля: " + engine);
    }
}
