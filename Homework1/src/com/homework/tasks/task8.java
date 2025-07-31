package com.homework.tasks;

//Задача 8: Расчет повышения зарплаты
//Для трех сотрудников:

//Маша: 67 760 рублей
//Денис: 83 690 рублей
//Кристина: 76 230 рублей

//Рассчитайте:
//Новую зарплату после повышения на 10%
//Разницу в годовом доходе до и после повышения

//Вывод для каждого сотрудника в формате:
//"[Имя] теперь получает [сумма] рублей. Годовой доход вырос на [разница] рублей"

class task8{
    public static void main(String args[]){

        int PayForMasha = 67760;
        String Masha = "Маша";
        int PayForDenis = 83690;
        String Denis = "Денис";
        int PayForKristina = 76230;
        String Kristina = "Кристина";
        float NewPayForMasha = PayForMasha * 1.1f;
        float NewPayForDenis = PayForDenis * 1.1f;
        float NewPayForKristina = PayForKristina * 1.1f;
        double DifferenceYearPayForMasha = NewPayForMasha * 12 - PayForMasha * 12;
        double DifferenceYearPayForDenis = NewPayForDenis * 12 - PayForDenis * 12;
        double DifferenceYearPayForKristina = NewPayForKristina * 12 - PayForKristina * 12;

        System.out.println(Masha + " теперь получает " + NewPayForMasha + " рублей. Годовой доход вырос на " + DifferenceYearPayForMasha + " рублей");
        System.out.println(Denis + " теперь получает " + NewPayForDenis + " рублей. Годовой доход вырос на " + DifferenceYearPayForDenis + " рублей");
        System.out.println(Kristina + " теперь получает " + NewPayForKristina + " рублей. Годовой доход вырос на " + DifferenceYearPayForKristina + " рублей");

    }
}