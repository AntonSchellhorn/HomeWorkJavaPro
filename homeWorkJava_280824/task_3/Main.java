package de.telran.homeWorkJava_280824.task_3;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Tesla Model S", "Электродвигатель");
        car.drive();        // Метод доступен водителю
        car.refuel();       // Метод доступен водителю
        car.changeOil();    // Метод доступен автомеханику
        car.checkEngine();  // Метод доступен автомеханику
    }

}

