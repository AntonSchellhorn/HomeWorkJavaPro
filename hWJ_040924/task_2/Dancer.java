package de.telran.hWJ_040924.task_2;
// Танцор, реализующий интерфейс Artist
public class Dancer implements Artist{

    @Override
    public void perform() {
        System.out.println("Танцор исполняет танец!");
    }
}
