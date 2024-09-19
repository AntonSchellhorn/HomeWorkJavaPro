package de.telran.hWJ_090924.Task_3;

public class Human {
    String name;
    int age;
    String eyeColor;

    public Human(String name, int age, String eyeColor) {
        this.name = name;
        this.age = age;
        this.eyeColor = eyeColor;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age + ", Eye Color: " + eyeColor;
    }
}
