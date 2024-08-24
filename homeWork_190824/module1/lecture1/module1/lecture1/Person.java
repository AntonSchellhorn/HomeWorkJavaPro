package de.telran.homeWork_190824.module1.lecture1.module1.lecture1;

public class Person {
    String fullName;
    int age;

    public Person() {    // конструктор по умолчанию!
    }

    public Person(String fullName, int age) {   // Конструктор с параментрами!
        this.fullName = fullName;
        this.age = age;
    }

    public void move() {        // Метод move !
        System.out.println(fullName + " Двигается!");
    }

    public void talk() {          //Метод talk !
        System.out.println(fullName + " Говорит!");
    }
    public void study() {
        System.out.println(fullName + " учится материться!");
    }
    public void promotes(){
        System.out.println(fullName + " Пропагандирует!");
    }

    public static void main(String[] args) {
        // Первый объект с коснструктаром по умолчанию!
        Person person1 = new Person();
        person1.fullName = "Полиграф Шариков";
        person1.age = 30;
        person1.move();
        person1.talk();
        person1.study();

        //Второй объект с конструктором и параметрами!
        Person person2 = new Person("Швондер",43);
        person2.talk();
        person2.move();
        person2.promotes();

    }

}
