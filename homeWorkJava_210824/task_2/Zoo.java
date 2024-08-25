package de.telran.homeWorkJava_210824.task_2;

public class Zoo {

    public static void main(String[] args) {
        Lion lion = new Lion(" Симба",7);
        Eagle eagle = new Eagle(" Эдди",10);
        System.out.println("Вас приветствует наш Zoo! Добро пожаловать!");
        System.out.println("-------------------");
        System.out.println("Льва зовут Симба,знакомтесь");
        lion.eat();
        lion.sleep();
        lion.walk();
        lion.makeSound();
        System.out.println("-------------------");
        System.out.println("Орла зовут Эдди,но ему пофиг))");
        eagle.eat();
        eagle.sleep();
        eagle.fly();
        eagle.makeSound();
    }
}
