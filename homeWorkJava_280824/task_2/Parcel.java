package de.telran.homeWorkJava_280824.task_2;

public class Parcel extends PostalItem{
    public Parcel(String name, String senderAddress, String recipientAddress) {
        super(name, senderAddress, recipientAddress);
    }

    @Override
    public void deliver() {
        System.out.println("Отправить бандероль по адреу : " + getRecipientAddress());
    }

    @Override
    public void send() {
        System.out.println("Отправить бандероль по адреу : " + getSenderAddress());
    }
}
