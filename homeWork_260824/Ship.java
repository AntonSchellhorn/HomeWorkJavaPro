package de.telran.homeWork_260824;

public class Ship implements Serviceable, Transportable, Swimmable{
    @Override
    public void service() {
        System.out.println(" Корабль проходит сервисное обслуживание.");
    }

    @Override
    public void repair() {
        System.out.println(" Корабль ремонтируется.");
    }

    @Override
    public void swim() {
        System.out.println(" Корабль плавает по воде.");
    }

    @Override
    public void transportationCargoes() {
        System.out.println(" Корабль перевозит большие объёмы груза.");
    }

    @Override
    public void transportationPassengers() {
        System.out.println(" Корабль перевозит множество пассажиров.");
    }
}
