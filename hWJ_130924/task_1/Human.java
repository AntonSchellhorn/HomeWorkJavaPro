package de.telran.hWJ_130924.task_1;


class Human {
    String name;
    String eyeColor;
    int age;

    public Human(String name, String eyeColor, int age) {
        this.name = name;
        this.eyeColor = eyeColor;
        this.age = age;
    }

    // Переопределяем метод toString для корректного вывода информации
    @Override
    public String toString() {
        return "Имя: " + name + ", Цвет глаз: " + eyeColor + ", Возраст: " + age;
    }
}

