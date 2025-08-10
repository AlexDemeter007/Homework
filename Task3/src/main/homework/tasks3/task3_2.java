package main.homework.tasks3;

//Задача 2: Рекомендация по одежде
//Напишите программу, которая:
//Объявляет переменную temperature с любым значением
//Дает рекомендацию носить шапку при температуре ниже 5°C
//Выводит сообщение в формате:
//"На улице [temperature] градусов, [нужно надеть шапку/можно идти без шапки]"

import java.text.DecimalFormat;

public class task3_2 {
    public static void main(String args[]){

        double temperature_random = (Math.random()*80)-30;
        //случайная температура от -30 до +50

        double scale = Math.pow(10, 2);
        double temperature = Math.ceil(temperature_random * scale) / scale;
        //чтобы оператор double выдавал 2 цифры после запятой

        if (temperature <= 5) {
            System.out.println("На улице " + temperature + " градусов по Цельсия, нужно надеть шапку");
        //условие, что температура ниже 5 градусов - необходима шапка

        } else {
            System.out.println("На улице " + temperature + " градусов по Цельсия, можно идти без шапки");
        //условие, что температура выше 5 градусов - шапка не нужна
        }
    }
}
