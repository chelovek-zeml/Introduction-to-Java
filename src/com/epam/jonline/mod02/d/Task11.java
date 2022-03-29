package com.epam.jonline.mod02.d;

public class Task11 {
	public static void main(String[] args) {
        System.out.println("11. Написать метод(методы), определяющий, в каком из данных двух чисел больше цифр");
        System.out.println();

        int a = 48353;
        int b = 27355;
        int x, c, d;

        x = a;
        c = value(x);
        x = b;
        d = value(x);

        if (c > d) {
            System.out.println("В числе " + a + " цифр больше , чем цифр в числе " + b);
        } else if (c == d) {
            System.out.println("В числе " + a + " количество цифр равно количеству цифр в числе " + b);
        } else {
            System.out.println("В числе " + b + " цифр больше , чем цифр в числе " + a);
        }
    }

    public static int value(int x) {
        int n = 0;
        while (x > 0) {
            x = x / 10;
            n++;
        }
        return n;
    }
}
