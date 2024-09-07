package de.telran.homeWorkJava_020924.task_2;
// Класс CoffeeMachine с реализацией Singleton через статический метод
public class CoffeeMachine {

    // Статическое поле, содержащее единственный экземпляр CoffeeMachine

    private static CoffeeMachine instance;

    // Приватный конструктор запрещает создание экземпляра извне


    public CoffeeMachine() {
        System.out.println("Кофемашина инициализирована.");
    }

    // Статический метод для получения единственного экземпляра


    public static CoffeeMachine getInstance() {
        // Ленивая инициализация: объект создаётся только при первом вызове
        if (instance == null) {
            instance = new CoffeeMachine();
        }
        return instance;
    }

    // Метод для приготовления кофе
    public void brewCoffee(String coffeeType){
        System.out.println("Готовим " + coffeeType + ".");
    }
}
