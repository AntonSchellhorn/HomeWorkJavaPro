package de.telran.homeWork_260824;

public class Truck implements Serviceable, Transportable, RoadMovable{
    @Override
    public void service() {
        System.out.println(" Грузовик проходит сервисное обслуживание.");
    }

    @Override
    public void repair() {
        System.out.println(" Грузовик ремонтируется.");
    }

    @Override
    public void transportationCargoes() {
        System.out.println(" Грузовик перевозит груз.");
    }

    @Override
    public void transportationPassengers() {

    }

    @Override
    public void movementRoad() {
        System.out.println(" Грузовик передвигается по дорогам.");
    }
}
