package com.homework.tasks;

//Задача 6: Расчет веса спортзавтрака
//Рассчитайте общий вес завтрака спортсмена в граммах и килограммах по рецепту:

//Бананы: 5 штук × 80 грамм
//Молоко: 200 мл (100 мл = 105 грамм)
//Мороженое: 2 брикета × 100 грамм
//Яйца: 4 штуки × 70 грамм

//Выведите оба значения в консоль.

//Зачем спортсменам мороженое? -_-


class task6{
    public static void main(String args[]){

        int BananaGrams = 80;
        int Bananas = 5;
        int MilkGrams = 105;
        int Milk = 2;
        int IcecreamGram = 100;
        int Icecreams = 2;
        int EggGram = 70;
        int Eggs = 4;
        int Gram = BananaGrams * Bananas + MilkGrams * Milk + IcecreamGram *  Icecreams + EggGram * Eggs;
        float Kilogram = Gram / 1000f;


        System.out.println("Общий вес завтрака спортсмена составляет " + Gram + " в граммах");
        System.out.println("Общий вес завтрака спортсмена составляет " + Kilogram + " в килограммах");


    }
}