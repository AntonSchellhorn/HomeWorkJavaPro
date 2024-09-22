package de.telran.hWJ_200924.task_2;

class Cat {
    String name;
    int age;
    double weight;
    String breed;

    public Cat(String name, int age, double weight, String breed) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.breed = breed;
    }

    @Override
    public String toString() {
        return "Имя: " + name + ", Возраст: " + age + ", Вес: " + weight + ", Порода: " + breed;
    }
}

