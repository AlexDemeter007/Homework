package main.homework.tasks3;

//Задача 8: Рекомендация мобильного приложения
//Напишите программу, которая:
//Объявляет переменную clientOS (0-iOS, 1-Android)
//Рекомендует соответствующее приложение
//Выводит сообщение:
//"Установите версию приложения для [iOS/Android] по ссылке"

import java.util.Random;

public class task3_8 {
    public static void main(String args[]){


        int clientOS = (int)(Math.random()*2);
        //случайное число 0-iOS, 1-Android
        if (clientOS == 0){
            System.out.println("Установите версию приложения для iOS по ссылке https://apple.com/appstore");
            //условие, что клиент использует iOS
        } else {
            System.out.println("Установите версию приложения для Android по ссылке https://play.google.com");
            //условие, что клиент использует Android

    }
    }
}
