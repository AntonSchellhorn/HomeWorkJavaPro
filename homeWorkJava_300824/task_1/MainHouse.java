package de.telran.homeWorkJava_300824.task_1;

public class MainHouse {
    public static void main(String[] args) {
        //Создаю дом
        House house = new House();

        // Добавляю жителей в дом
        house.addResident(new Resident("Иван"));
        house.addResident(new Resident("Мария"));
        house.addResident(new Resident("сын Вася"));
        house.addResident(new Resident("дочь Настя"));

        // печатаю детали дома
        house.showHouseDetails();

        // печатаю информацию о жельцах
        house.showResidents();
    }
}
