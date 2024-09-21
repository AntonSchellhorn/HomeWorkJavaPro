package de.telran.hWJ_180924.task_3;


class Vehicle {
    String type;
    int basePriority; // Базовый приоритет
    int currentPriority; // Текущий приоритет, зависит от условий

    public Vehicle(String type, int basePriority) {
        this.type = type;
        this.basePriority = basePriority;
        this.currentPriority = basePriority;
    }

    @Override
    public String toString() {
        return "Транспорт: " + type + ", Текущий приоритет: " + currentPriority;
    }
}





