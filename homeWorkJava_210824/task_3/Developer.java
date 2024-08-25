package de.telran.homeWorkJava_210824.task_3;

public class Developer extends Employee{
    public Developer(String name, int id, double salary) {
        super(name, id, salary);
    }

    public void writeCode(){
        System.out.println(name + " пишет код");
    }
}
