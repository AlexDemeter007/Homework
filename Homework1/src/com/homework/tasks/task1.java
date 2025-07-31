package com.homework.tasks;

//Задача 1: Объявление переменных примитивных типов
//Объявите переменные всех примитивных типов Java:
//Выведите значения этих переменных в консоль в формате:
        //"Значение переменной [имя] с типом [тип] равно [значение]"

class task1{
    public static void main(String args[]){

        int year = 1998;
        byte floor = 13;
        short level = 20453;
        long kilometres = 80000L;
        float pi = 3.14159f;
        double grams = 10.67;
        char Slytherin = 'S';
        boolean AmIFrog = true;

        System.out.println("Значение переменной [year] с типом [int] равно " + year);
        System.out.println("Значение переменной [floor с типом [byte] равно " + floor);
        System.out.println("Значение переменной [level с типом [short] равно " + level);
        System.out.println("Значение переменной [kilometres] с типом [long] равно " + kilometres);
        System.out.println("Значение переменной [pi] с типом [float] равно " + pi);
        System.out.println("Значение переменной [grams] с типом [double] равно " + grams);
        System.out.println("Значение переменной [Slytherin] с типом [char] равно " + Slytherin);
        System.out.println("Значение переменной [AmIFrog] с типом [boolean] равно " + AmIFrog);

    }
}
