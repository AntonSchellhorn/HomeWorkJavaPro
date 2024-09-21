package de.telran.hWJ_160924.task_2;

public class Ticket implements Comparable<Ticket> {
    String name; // ФИО клиента
    int birthYear; // Год рождения клиента
    String operationType; // Тип операции
    int ticketNumber; // Номер талончика

    public Ticket(String name, int birthYear, String operationType, int ticketNumber) {
        this.name = name;
        this.birthYear = birthYear;
        this.operationType = operationType;
        this.ticketNumber = ticketNumber;
    }

    @Override
    public int compareTo(Ticket other) {
        return Integer.compare(this.ticketNumber, other.ticketNumber); // Сортировка по номеру талона
    }

    @Override
    public String toString() {
        return "ФИО: " + name + ", Год рождения: " + birthYear + ", Операция: " + operationType + ", Талон №: " + ticketNumber;
    }
}
