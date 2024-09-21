package de.telran.hWJ_130924.task_2;



class Ticket implements Comparable<Ticket> {
    String name;
    int yearOfBirth;
    String operationType;
    int ticketNumber;

    public Ticket(String name, int yearOfBirth, String operationType, int ticketNumber) {
        this.name = name;
        this.yearOfBirth = yearOfBirth;
        this.operationType = operationType;
        this.ticketNumber = ticketNumber;
    }

    @Override
    public int compareTo(Ticket other) {
        return Integer.compare(this.ticketNumber, other.ticketNumber); // Сортировка по номеру талона
    }

    @Override
    public String toString() {
        return "Имя: " + name + ", Год рождения: " + yearOfBirth + ", Операция: " + operationType + ", Талон №: " + ticketNumber;
    }
}

