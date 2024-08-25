package de.telran.homeWorkJava_210824.task_2;

public class Animal {
    String name;
    int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void eat(){
        System.out.println(name + " ест");
    }

    public void sleep(){
        System.out.println(name + " спит");
    }

    public void makeSound(){
        System.out.println(name + " издаёт звук");
    }
}
