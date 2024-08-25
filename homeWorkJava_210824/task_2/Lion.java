package de.telran.homeWorkJava_210824.task_2;

public class Lion extends Mammal{

    public Lion(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound(){
        System.out.println(name + " ревёт!");
    }
}
