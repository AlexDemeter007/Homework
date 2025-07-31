package com.homework.tasks;

//Задача 5: Расчет краски для школы
// ремонт школы купили 120 банок краски двух цветов. На один класс требуется:

        //2 банки белой краски
//4 банки коричневой краски

//Рассчитайте:
//Сколько всего классов в школе
//Сколько банок каждого цвета было куплено

//Вывод в формате:
        //"В школе, где [число] классов, нужно [число] банок белой краски и [число] банок коричневой краски"

class task5{
    public static void main(String args[]){

        final int pots = 120;
        int WhitePaintInOneClass = 2;
        int BrownPaintInOneClass = 4;
        int classes = pots / (WhitePaintInOneClass + BrownPaintInOneClass);
        int WhitePaint = classes * WhitePaintInOneClass;
        int BrownPaint = classes * BrownPaintInOneClass;

        System.out.println("В школе, где " + classes + " классов, нужно " + WhitePaint + " банок белой краски и " + BrownPaint + " банок коричневой краски");


    }
}
