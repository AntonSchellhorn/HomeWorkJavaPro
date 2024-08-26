package de.telran.homeWorkJava_230824;

public class RussianGerman extends Translator{
    public RussianGerman(String name, int age, String gender) {
        super(name, age, gender);
    }
    @Override
    public void retranslate(String text){
        System.out.println("Перевод с русского на немецкий: " + text);
    }
}
