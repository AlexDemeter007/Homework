package com.homework.tasks;

//Задача 3: Расчет бумаги для учеников
//Три учителя имеют классы с разным количеством учеников:

//Людмила Павловна: 23 ученика
//Анна Сергеевна: 27 учеников
//Екатерина Андреевна: 30 учеников
//Они вместе закупили 480 листов бумаги. Рассчитайте, сколько листов достанется каждому ученику. Выведите результат в формате:
//"На каждого ученика рассчитано [число] листов бумаги"


class task3{
    public static void main(String args[]){

        int LudmilaPavlovna = 23;
        int AnnaSergeevna = 27;
        int EkaterinaAndreevna = 30;
        final int papers = 480;
        int PaperForOneStudent = papers / (LudmilaPavlovna + AnnaSergeevna + EkaterinaAndreevna);

        System.out.println("На каждого ученика рассчитано " + PaperForOneStudent + " листов бумаги");

    }
}