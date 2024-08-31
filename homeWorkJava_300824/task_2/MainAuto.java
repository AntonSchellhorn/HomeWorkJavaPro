package de.telran.homeWorkJava_300824.task_2;

public class MainAuto {
    public static void main(String[] args) {
        // Создаем грузопассажирский автомобиль
        CargoPassengerCar cargoPassengerCar = new CargoPassengerCar("Грузопассажир", "V8", 4, 1000);

        // Печатаем информацию о перевозке пассажиров и груза
        cargoPassengerCar.transportPassengers();
        cargoPassengerCar.transportCargo();
    }
}
