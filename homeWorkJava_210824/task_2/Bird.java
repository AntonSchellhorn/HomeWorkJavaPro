package de.telran.homeWorkJava_210824.task_2;

public class Bird extends Animal{

    public Bird(String name, int age) {
        super(name, age);
    }

    public void fly(){
        System.out.println(name + " летает");
    }

}
