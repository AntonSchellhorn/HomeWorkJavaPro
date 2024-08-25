package de.telran.homeWorkJava_210824;

//Создаю класс наследник с доступом к Pet при помощи расширения extends
public class Dog extends Pet{

    //Конструктор
    public Dog(String name, int age) {
        super(name, age);
    }

    // Передача метода makeSound для собак

    @Override
    public void makeSound(){
        System.out.println(name + " Гавкает и рычит");
    }
    // Метод который симулирует процесс игры пса с мячом
    public void fetch(){
        System.out.println(name + " Приносит мяч");
    }
}
