package de.telran.homeWork_190824.module1.lecture1.module1.lecture1;

public class Phone {

    String number;
    String model;
    double weight;

    //Конструктор с параметрами !
    public Phone(String number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    //метод receiveCall
    public void receiveCall(String name){
        System.out.println("Звонит " + name);
    }

    //Метод getNumber
    public String getNumber(){
        return number;
    }

    public static void main(String[] args) {
        // Создаём три объекта класса Phone
        Phone phone1 = new Phone("111-111-111","Xiaomi",130.4);
        Phone phone2 = new Phone("222-222-222","Samsung",150.0);
        Phone phone3 = new Phone("333-333-333","IPhone",140.2);

        //Вывожу на консоль значения переменных
        System.out.println("Phone1: " + phone1.number + " , " + phone1.model + " , " + phone1.weight + "g");
        System.out.println("Phone2: " + phone1.number + " , " + phone1.model + " , " + phone1.weight + "g");
        System.out.println("Phone3: " + phone1.number + " , " + phone1.model + " , " + phone1.weight + "g");

        //Вызываю методы для каждого объекта
        phone1.receiveCall("Швондер");
        phone2.receiveCall("Шариков");
        phone3.receiveCall("пр.Преображенский");

        System.out.println("Номер телефона 1: " + phone1.getNumber());
        System.out.println("Номер телефона 2: " + phone2.getNumber());
        System.out.println("Номер телефона 3: " + phone3.getNumber());
    }
}
