package de.telran.homeWorkJava_210824;
//Создаю класс наследник с доступом к Pet при помощи расширения extends
public class Cat extends Pet{
    //вызываю конструктор класса Cat,который вызывает конструктор родительского класса
    public Cat(String name, int age) {
        super(name, age);
    }

    //Переопределение метода makeSound для кошек
    @Override
    public void makeSound(){
        System.out.println(name + " Мяукает и мурлычет!");
    }

    public void scratch(){
        System.out.println(name + " Царапается!");
    }
}

