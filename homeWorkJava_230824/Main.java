package de.telran.homeWorkJava_230824;

public class Main {
    public static void main(String[] args) {
        Translator translator1 = new EnglishRussian("Ян",30,"Мужской");
        Translator translator2 = new RussianGerman("Светлана",25,"Женский");
        System.out.println("Переводчик Ян");
        translator1.retranslate("Привет");
        System.out.println("Переводчица Светлана");
        translator2.retranslate("Hallo");
    }
}
