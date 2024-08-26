package de.telran.homeWorkJava_230824;
// Переводчик с Английского на Русский
public class EnglishRussian extends Translator{
    //Конструктор
    public EnglishRussian(String name, int age, String gender) {
        super(name, age, gender);
    }
    @Override
    public void retranslate(String text){
        System.out.println("Перевод с английского на русский: " + text);
    }
}
