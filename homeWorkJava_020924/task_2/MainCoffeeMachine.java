package de.telran.homeWorkJava_020924.task_2;

import java.util.concurrent.Callable;

public class MainCoffeeMachine {
    public static void main(String[] args) {
        // Все пользователи получают один и тот же экземпляр кофемашины

        CoffeeMachine machine1 = CoffeeMachine.getInstance();
        machine1.brewCoffee("Эспрессо");
        CoffeeMachine machine2 = CoffeeMachine.getInstance();
        machine2.brewCoffee("Капучино");
        CoffeeMachine machine3 = CoffeeMachine.getInstance();
        machine3.brewCoffee("Латтэ");
    }
}
