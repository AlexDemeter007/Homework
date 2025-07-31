package com.homework.tasks;


//Задача 4: Производительность бутылочного автомата
//Автомат производит 16 бутылок за 2 минуты. Рассчитайте:

//Производительность за 20 минут
//Производительность за сутки (1440 минут)
//Производительность за 3 дня
//Производительность за 1 месяц (30 дней)

//Вывод в формате:
//"За [время] машина произвела [количество] штук бутылок"

class task4{
    public static void main(String args[]){

        int Automat = 16;
        int Time = 2;
        int BottlesInminute = Automat / Time;
        int TwentyMinutes = 20;
        String Minutes = "минут";
        int BottlesInTwentyMinutes = TwentyMinutes * BottlesInminute;
        int DayInMinutes = 1440;
        int Day = 1;
        String Sutki = "сутки";
        int BottlesInDay = DayInMinutes * BottlesInminute;
        int ThreeDays = 3;
        String Days = "дня";
        int BottlesInThreeDays= ThreeDays * BottlesInDay;
        int MonthInDays = 30;
        int Month = 1;
        String mesyats = "месяц";
        int BottlesInMonth = MonthInDays * BottlesInDay;

        System.out.println("За " + TwentyMinutes + " " + Minutes + " машина произвела " + BottlesInTwentyMinutes + " штук бутылок");
        System.out.println("За " + Day + " " + Sutki + " машина произвела " + BottlesInDay + " штук бутылок");
        System.out.println("За " + ThreeDays + " " + Days + " машина произвела " + BottlesInThreeDays + " штук бутылок");
        System.out.println("За " + Month + " " + mesyats + " машина произвела " + BottlesInMonth + " штук бутылок");

    }
}
