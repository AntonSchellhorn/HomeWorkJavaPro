package de.telran.homeWorkJava_280824.task_2;

public class Package extends PostalItem {
    public Package(String name, String senderAddress, String recipientAddress) {
        super(name, senderAddress, recipientAddress);
    }

    @Override
    public void deliver() {
        System.out.println("Отправить Посылку по адреу : " + getRecipientAddress());
    }

    @Override
    public void send() {
        System.out.println("Отправить Посылку по адреу : " + getSenderAddress());
    }
}
