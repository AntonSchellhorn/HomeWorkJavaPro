package de.telran.homeWorkJava_300824.task_1;


import java.util.ArrayList;
import java.util.List;

// Класс Дом который содержит объекты
public class House {
    private Roof roof;
    private Wall wall;
    private Window window;
    private Door door;
    private List<Resident> residents;

    // конструктор Дома ,который создаёт все его компоненты(композиция)


    public House() {
        this.roof = new Roof("Металл");
        this.wall = new Wall("Бетон");
        this.window = new Window("Пластиковое окно");
        this.door = new Door("Деревянная дверь");
        this.residents = new ArrayList<>();
    }

    //метод для добавления жителя в дом(агрегация)
    public void addResident(Resident resident){
        residents.add(resident);
    }

    //Метод для получения информации о жителях
    public void showResidents(){
        for (Resident resident : residents){
            System.out.println("Житель : " + resident.getName());
        }
    }

    //Метод для получения информации о доме и его компонентах
    public void showHouseDetails(){
        System.out.println("Крыша сделана из : " + roof.getMaterial());
        System.out.println("Стены сделаны из : " + wall.getMaterial());
        System.out.println("Окна типа : " + window.getType());
        System.out.println("Дверь сделана из : " + door.getMaterial());
    }
}
