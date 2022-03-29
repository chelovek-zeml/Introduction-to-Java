package com.epam.jonline.mod02.d;

public class Task06 {
	public static void main(String[] args) {
        System.out.println("6. Написать метод(методы), проверяющий, являются ли данные три числа взаимно простыми.\n" +
                "Взаимно простые числа — целые числа, не имеющие никаких общих делителей, кроме ±1.  ");
        System.out.println();

        int a = 12;
        int b = 7;
        int c = 13;
        int x, y;

        x = a;
        y = b;
        int d = nod(x, y);

        x = d;
        y = c;
        d = nod(x, y);

        if (d == 1) {
            System.out.println("числа " + a + " , " + b + " , " + c + " взаимно простые числа ");
        } else {
            System.out.println("числа " + a + " , " + b + " , " + c + " не являются взаимно простыми числами ");
        }

    }

    public static int nod(int x, int y) {
        int k = 0;
        while (x != 0 && y != 0) {
            if (x > y) {
                x %= y;
            } else {
                y %= x;
            }
            k = x + y;
        }
        return k;
    }
}
