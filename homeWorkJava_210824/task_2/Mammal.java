package de.telran.homeWorkJava_210824.task_2;

public class Mammal extends Animal{
    public Mammal(String name, int age) {
        super(name, age);
    }

    public void walk(){
        System.out.println(name + " ходит");
    }

}
