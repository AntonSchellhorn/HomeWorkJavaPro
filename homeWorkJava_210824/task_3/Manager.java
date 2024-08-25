package de.telran.homeWorkJava_210824.task_3;

class Manager extends Employee{
    public Manager(String name, int id, double salary) {
        super(name, id, salary);
    }

    public void holdMeeting(){
        System.out.println(name + " проводит совещание");
    }
}
