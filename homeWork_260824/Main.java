package de.telran.homeWork_260824;

public class Main {
    public static void main(String[] args) {
        // Создаю объекты нашего транспорта
        Bus bus = new Bus();
        Truck truck = new Truck();
        Car car = new Car();
        Ship ship = new Ship();
        Plane plane = new Plane();

        // Демонстрация работы метадов класса Bus
        System.out.println(" Демонстрация работы автобуса : ");
        bus.service();
        bus.repair();
        bus.transportationPassengers();
        bus.transportationCargoes();
        bus.movementRoad();
        System.out.println("~~~~~~~~~~~~~");

        // Демонстрация работы методов класса Truck
        System.out.println(" Демонстрация работы грузовика : ");
        truck.service();
        truck.repair();
        truck.movementRoad();
        truck.transportationCargoes();
        System.out.println("~~~~~~~");

        // Демонстрация работы класса Сar
        System.out.println(" Демонстрация работы легкового автомобиля : ");
        car.service();
        car.repair();
        car.movementRoad();
        car.transportationPassengers();
        car.transportationCargoes();
        System.out.println("~~~");

        // Демонстрация работы класса Ship
        System.out.println(" Демонстрация работы коробля : ");
        ship.service();
        ship.repair();
        ship.swim();
        ship.transportationPassengers();
        ship.transportationCargoes();
        System.out.println("~~~~~~~");

        // Демонстрация работы класса Plane
        System.out.println(" Демонстрация работы самолёта : ");
        plane.service();
        plane.repair();
        plane.fly();
        plane.transportationPassengers();
        plane.transportationCargoes();
        System.out.println("~~~~~~~~~~~~~~~~~");

    }
}
