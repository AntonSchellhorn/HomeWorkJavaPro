package de.telran.homeWorkJava_210824.task_3;

class Employee {
    String name;
    int id;
    double salary;


    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public void work(){
        System.out.println(name + " работает");
    }

}
