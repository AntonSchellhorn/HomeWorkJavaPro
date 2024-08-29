package de.telran.homeWorkJava_280824.task_2;

public class Letter extends PostalItem{
    public Letter(String name, String senderAddress, String recipientAddress) {
        super(name, senderAddress, recipientAddress);
    }

    @Override
    public void deliver() {
        System.out.println("Отправить письмо по адресу : " + getRecipientAddress());
    }

    @Override
    public void send() {
        System.out.println("Отправить письмо по адресу : " + getSenderAddress());
    }
}
