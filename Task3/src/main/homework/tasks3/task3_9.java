package main.homework.tasks3;

//Задача 9: Облегченная версия приложения
//Усложните задачу 8:
//Добавьте переменную clientDeviceYear (год выпуска)
//Для устройств до 2015 года рекомендуйте облегченную версию
//Выводите сообщение:
//"Установите [облегченную] версию приложения для [iOS/Android] по ссылке"

public class task3_9 {
    public static void main(String args[]){


        int clientOS = (int)(Math.random()*2);
        //случайное число 0-iOS, 1-Android

        int clientDeviceYear = (int)((Math.random()*25)+2000);
        //случайный год выпуска девайса от 2000 до 2025 г.

        if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке https://apple.com/appstore");
            //условие, что клиент использует iOS после 2015 года

        } else if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке https://play.google.com");
            //условие, что клиент использует Android после 2015 года

        } else if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке https://apple.com/appstore/lite");
            //условие, что клиент использует iOS до 2015 года
        } else {
            System.out.println("Установите облегченную версию приложения для Android по ссылке https://play.google.com/lite");
            //условие, что клиент использует Android

    }
    }
}
