package com.epam.jonline.mod01.a;

/*5.  Дано  натуральное  число  Т,  которое  представляет  длительность  прошедшего  времени  в  секундах.  Вывести
данное значение длительности в часах, минутах и секундах в следующей форме:
ННч ММмин SSc*/

public class Task05 {
    public static void main(String[] args) {

        int T = 3940;
        int HH = T / 3600;
        int MM = (T - HH * 3600) / 60;
        int SS = (T - (HH * 3600) - (MM * 60)) ;

        System.out.println(T + "c." + " = " + HH + "ч. " + MM + "мин. " + SS + "c.");

    }
}
