package main.homework.tasks3;

//Задача 7: Нахождение максимального числа
//Напишите программу, которая:
//Объявляет три переменные one, two, three с любыми значениями
//Находит наибольшее из трех чисел
//Выводит результат в формате:
//"Наибольшее число: [max]"
public class task3_7 {
    public static void main(String args[]){

        int one = (int)(Math.random()*2000000)+1;
        //случайное число one

        int two = (int)(Math.random()*2000000)+1;
        //случайное число two

        int three = (int)(Math.random()*2000000)+1;
        //случайное число three

        int max = (one > two) ?
                ((one > three) ? one : three) :
                ((two > three) ? two : three);
        //выбирает максимальное из случайных

        System.out.println("Наибольшее число: " + max);
    }
}
