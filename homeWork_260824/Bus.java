package de.telran.homeWork_260824;

public class Bus implements Serviceable, Transportable, RoadMovable {
    @Override
    public void service() {
        System.out.println(" Автобус проходит сервисное обслуживание.");
    }

    @Override
    public void repair() {
        System.out.println(" Автобус ремонтируется.");
    }

    @Override
    public void movementRoad() {
        System.out.println(" Автобус передвигается по дороге.");
    }

    @Override
    public void transportationPassengers() {
        System.out.println(" Автобус перевозит пассажиров.");
    }

    @Override
    public void transportationCargoes() {
        System.out.println(" Автобус перевозит лёгкий груз.");
    }
}
