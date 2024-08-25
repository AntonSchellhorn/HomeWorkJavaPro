package de.telran.homeWorkJava_210824;

public class Main {
    public static void main(String[] args) {
        //Создание объекта класса Cat с именем "Мурка" и возрастом 3 года
        Cat cat = new Cat("Мурка",3);

        // Создание объекта класса Dog с именем "Шарик" и возрастом 2 года
        Dog dog = new Dog("Шарик",2);

        //Вызов методов для объекта cat (Кошка)

        cat.eat();
        cat.sleep();
        cat.makeSound();
        cat.scratch();

        //Вызов методов для объекта dog (Собака)
        dog.eat();
        dog.sleep();
        dog.makeSound();
        dog.fetch();
    }
}
