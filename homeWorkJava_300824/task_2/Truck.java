package de.telran.homeWorkJava_300824.task_2;
    // Наследник класса Авто, который представляет грузовой автомобиль
public class Truck extends Auto{
    private int cargoCapacity;

    // Конструктор

        public Truck(String model, String engine, int cargoCapacity) {
            super(model, engine);
            this.cargoCapacity = cargoCapacity;
        }

        // Метод для получения информации о грузоподъемности
        public int getCargoCapacity(){
            return cargoCapacity;
        }

        // Метод для перевозки груза
        public void transportCargo(){
            System.out.println("Перевозка груза весом " + cargoCapacity + " кг.");
        }

    }
