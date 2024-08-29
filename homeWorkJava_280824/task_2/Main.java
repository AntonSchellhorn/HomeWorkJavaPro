package de.telran.homeWorkJava_280824.task_2;

public class Main {
    public static void main(String[] args) {


        PostalItem letter = new Letter("Письмо", "Адрес Отправителя", "Адрес Получателя");
        letter.send();
        letter.deliver();
        System.out.println("---------");
        PostalItem packageItem = new Package("Посылка", "Адрес Отправителя", "Адрес Получателя");
        packageItem.send();
        packageItem.deliver();
        System.out.println("---------");
        PostalItem parcel = new Parcel("Бандероль","Адрес Отправителя","Адрес Получателя");
        parcel.send();
        parcel.deliver();
        System.out.println("---------");
        PostalItem container = new Container("Контейнер","Адрес Отправителя","Адрес Получателя");
        container.send();
        container.deliver();
    }
}
