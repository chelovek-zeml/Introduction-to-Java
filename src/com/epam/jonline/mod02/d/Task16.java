package com.epam.jonline.mod02.d;

public class Task16 {
	public static void main(String[] args) {
        System.out.println("16.  Написать  программу,  определяющую  сумму  n  -  значных  чисел,  содержащих  только  нечетные  цифры. \n" +
                "Определить также, сколько четных цифр в найденной сумме. Для решения задачи использовать декомпозицию. ");
        System.out.println();

        int k = 3757;
        int t = 0;

        int x = sum(k);
        System.out.println("Количество четных чисел в " + x + " равно: ");
        while (x > 0) {
            int m = x % 10;
            if (m % 2 == 0) {
                t++;
            }
            x = x / 10;
        }
        System.out.println(t);
    }

    public static int sum(int k) {

        int s = 0;
        System.out.println("Сумма нечетных цифр в числе " + k + " равна: ");
        while (k > 0) {
            s = s + k % 10;
            k = k / 10;
        }
        System.out.println(s);
        return s;
    }
}
