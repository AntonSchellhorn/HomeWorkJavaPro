package de.telran.homeWorkJava_300824.task_2;
// Наследник класса Авто, который представляет легковой автомобиль
public class PassengerCar extends Auto{
    private int passengerCapacity;
     // конструктор

    public PassengerCar(String model, String engine, int passengerCapacity) {
        super(model, engine);
        this.passengerCapacity = passengerCapacity;
    }

    // Метод для получения информации о вместимости пассажиров
    public int getPassengerCapacity(){
        return passengerCapacity;
    }

    // Метод для перевозки пассажиров
    public void transportPassengers(){
        System.out.println("Перевозка " + passengerCapacity + " пассажиров. ");
    }
}
