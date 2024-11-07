package de.telran.homeWork.hWJ_051124.task_2;

public class PhoneApp {

    public static void main(String[] args) {

        Phone xioami = new Phone("+123456789","Redmi 13 Pro",0.17);
        Phone iphpne = new Phone("+987654321","15 Pro",0.2);

        xioami.receiveCall(" Васька косой");
        iphpne.receiveCall(" Макс Максимов");

    }
}
