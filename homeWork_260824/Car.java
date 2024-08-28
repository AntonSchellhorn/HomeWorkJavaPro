package de.telran.homeWork_260824;

public class Car implements Serviceable,Transportable,RoadMovable{
    @Override
    public void movementRoad() {
        System.out.println(" Легковой автомобиль передвигается по дорогам.");
    }

    @Override
    public void service() {
        System.out.println(" Легковой автомобиль проходит сервисное обслуживание.");
    }

    @Override
    public void repair() {
        System.out.println(" Легковой автомобиль ремонтируется.");
    }

    @Override
    public void transportationCargoes() {
        System.out.println(" Легковой автомобиль перевозит лёгкий груз.");
    }

    @Override
    public void transportationPassengers() {
        System.out.println(" Легковой автомобиль перевозит небольшое колличество пассажиров");
    }
}
