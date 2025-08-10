package main.homework.tasks3;

//Дополнительное задание
//Напишите программу, которая:
//Объявляет переменную monthNumber (1-12)
//Определяет сезон:
//12,1,2 → зима
//3-5 → весна
//6-8 → лето
//9-11 → осень
//Выводит сообщение:
//"[monthNumber] месяц принадлежит к сезону [сезон]"

public class task3_dop {
    public static void main(String args[]){

        int monthNumber = (int)((Math.random()*11)+1);
        //случайное число от 1 до 12

        String season;

        if (monthNumber >= 3 && monthNumber <= 5) {
            season = "весна";
            //3-5 месяца

        } else if (monthNumber >= 6 && monthNumber <= 8) {
            season = "лето";
            //6-8 месяца

        } else if (monthNumber >= 9 && monthNumber <= 11) {
            season = "осень";
            //9-11 месяца

        } else
            season = "зима";

        System.out.println(monthNumber + " месяц принадлежит к сезону " + season);

    }
}



