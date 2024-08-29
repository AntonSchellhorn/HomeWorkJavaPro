package de.telran.homeWorkJava_280824.task_2;

abstract class PostalItem {
    // Характеристики постового отправления
    private String name;                 // Наименование отправления
    private String senderAddress;        // Адрес отправления
    private String recipientAddress;     // Адрес получателя

    // Конструктор для установки значения характеристик

    public PostalItem(String name, String senderAddress, String recipientAddress) {
        this.name = name;
        this.senderAddress = senderAddress;
        this.recipientAddress = recipientAddress;
    }

    // Абсттрактные методы которые буду реализованы в подклассах
    public abstract void deliver();       // Доставить адресату
    public abstract void send();          // Отправить

    // Геттеры для получения значения характеристик

    public String getName() {
        return name;
    }

    public String getSenderAddress() {
        return senderAddress;
    }

    public String getRecipientAddress() {
        return recipientAddress;
    }
}
