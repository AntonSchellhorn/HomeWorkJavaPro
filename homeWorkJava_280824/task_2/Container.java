package de.telran.homeWorkJava_280824.task_2;

public class Container extends PostalItem{
    public Container(String name, String senderAddress, String recipientAddress) {
        super(name, senderAddress, recipientAddress);
    }

    @Override
    public void deliver() {
        System.out.println("Отправить контейнер по адреу : " + getRecipientAddress());    }

    @Override
    public void send() {
        System.out.println("Отправить контейнер по адреу : " + getSenderAddress());
    }
}
