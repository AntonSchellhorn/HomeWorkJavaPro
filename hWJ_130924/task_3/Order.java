package de.telran.hWJ_130924.task_3;

class Order {
    String dishName;
    int orderId;

    public Order(String dishName, int orderId) {
        this.dishName = dishName;
        this.orderId = orderId;
    }

    @Override
    public String toString() {
        return "Блюдо: " + dishName + ", Номер заказа: " + orderId;
    }
}

