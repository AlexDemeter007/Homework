package com.homework.tasks;

//Задача 7: Расчет времени похудения
//Спортсмену нужно сбросить 7 кг. Рассчитайте:

//Сколько дней потребуется при потере 250 грамм в день
//Сколько дней потребуется при потере 500 грамм в день
//Среднее количество дней для похудения
//Выведите все три результата в консоль.

class task7{
    public static void main(String args[]){

        final int LoseWeight= 7;
        float FirstOption = 0.25f;
        float SecondOption = 0.5f;
        double FirstOptionDays = LoseWeight / FirstOption;
        double SecondOptionDays = LoseWeight / SecondOption;
        double AverageDays = (FirstOptionDays + SecondOptionDays) / 2;



        System.out.println("При потере 250 грамм в день потребуется " + FirstOptionDays + " дней");
        System.out.println("При потере 500 грамм в день потребуется " + SecondOptionDays + " дней");
        System.out.println("Для похудения в среднем потребуется " + AverageDays + " день");

    }
}
