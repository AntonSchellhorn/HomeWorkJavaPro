package de.telran.homeWork_260824;

public class Plane implements Serviceable, Transportable, Flyable{
    @Override
    public void fly() {
        System.out.println(" Самолёт летает.");
    }

    @Override
    public void service() {
        System.out.println(" Самолёт проходит сервисное обслуживание.");
    }

    @Override
    public void repair() {
        System.out.println(" Самолёт ремантируется.");
    }

    @Override
    public void transportationCargoes() {
        System.out.println(" Самолёт перевозит грузы.");
    }

    @Override
    public void transportationPassengers() {
        System.out.println(" Самолёт перевозит пассажиров.");
    }
}
