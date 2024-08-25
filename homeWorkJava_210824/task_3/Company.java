package de.telran.homeWorkJava_210824.task_3;

public class Company {
    public static void main(String[] args) {
        Manager manager = new Manager("Alice",101,75000);
        Developer developer = new Developer("Mark",102,100000);
        HR hr = new HR("Elena",103,50000);

        manager.work();
        manager.holdMeeting();
        System.out.println("");
        developer.work();
        developer.writeCode();
        System.out.println("");
        hr.work();
        hr.recruit();
    }
}
