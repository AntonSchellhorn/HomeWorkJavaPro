package de.telran.homeWorkJava_300824.task_2;
// Класс, который комбинирует функциональность грузового и пассажирского автомобиля
public class CargoPassengerCar extends Auto{
    private int passengerCapacity;
    private int cargoCapacity;

    // Конструктор

    public CargoPassengerCar(String model, String engine, int passengerCapacity, int cargoCapacity) {
        super(model, engine);
        this.passengerCapacity = passengerCapacity;
        this.cargoCapacity = cargoCapacity;
    }

    // Метод для перевозки пассажиров
    void transportPassengers(){
        System.out.println("Перевозка " + passengerCapacity + " пассажиров.");
    }

    // Метод для перевозки груза
    public void transportCargo() {
        System.out.println("Перевозка груза весом " + cargoCapacity + " кг.");
    }
}
