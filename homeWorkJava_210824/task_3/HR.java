package de.telran.homeWorkJava_210824.task_3;

public class HR extends Employee{
    public HR(String name, int id, double salary) {
        super(name, id, salary);
    }

    public void recruit(){
        System.out.println(name + " набирает на работу новых специалистов");
    }
}
