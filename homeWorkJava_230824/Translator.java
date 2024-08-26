package de.telran.homeWorkJava_230824;
  // Создаю абстрактный класс Переводчик( Translator )
public abstract class Translator {
  // Характеристики переводчика
   String name;
   int age;
   String gender;

  //Конструктор класса

      public Translator(String name, int age, String gender) {
          this.name = name;
          this.age = age;
          this.gender = gender;
      }

      // абстрактный метод для перевода
      public abstract void retranslate(String text);

      // Геттеры для характеристик
      public String getName(){
          return name;
      }
      public int getAge(){
          return age;
      }
      public String getGender(){
          return gender;
      }
  }
