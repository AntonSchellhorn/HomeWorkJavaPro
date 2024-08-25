package de.telran.homeWorkJava_210824.task_2;

public class Eagle extends Bird{

    public Eagle(String name, int age) {
        super(name, age);
    }

    @Override

    public void makeSound(){
        System.out.println(name + " визжит");
    }
}
