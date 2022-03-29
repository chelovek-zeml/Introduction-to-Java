package com.epam.jonline.mod01.c;

/*5. Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль которых больше или равен
заданному е. Общий член ряда имеет вид:
     an = 1 / 2^n + 1 / 3^n;


*/

public class Task05 {
    public static void main(String[] args) {

        int n = 1;
        double e = 1;
        double sum = 0;

        for (double i = -5; i <= n; i++) {

            double t = Math.abs((1 / Math.pow(2, i)) + (1 / Math.pow(3, i)));
            if (t > e) {

                sum = sum + t;
            }
        }
        System.out.println(sum);
    }
}
