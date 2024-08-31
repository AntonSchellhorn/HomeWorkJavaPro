package de.telran.homeWorkJava_300824.task_1;
// Житель Дома(Объект который будет фссоциирован с Домом через агрегацию
public class Resident {
    private  String name;

    //Конструктор :

    public Resident(String name) {
        this.name = name;
    }

    // Метод для получения имени жителя
    public String getName(){
        return name;
    }
}
