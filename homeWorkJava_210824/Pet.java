package de.telran.homeWorkJava_210824;

public class Pet {
    //Создаю общие переменные
    String name;
    int age;


    //Создаю конструктор с общими параметрами
    public Pet(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //Создаю метод eat
    public void eat(){
        System.out.println(name + " кушает");
    }

    //Создаю метод sleep
    public void sleep(){
        System.out.println(name + " спит");
    }

    //Создаю метод makeSound
    public void makeSound(){
        System.out.println(name + " Издаёт звук");
    }
}
