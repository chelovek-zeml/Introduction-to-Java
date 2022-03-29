package com.epam.jonline.mod02.d;

public class Task02 {
	public static void main(String[] args) {
        System.out.println("2. Написать метод(методы) для нахождения наибольшего общего делителя четырех натуральных чисел.");
        System.out.println();

        int a = 36;
        int b = 316;
        int c = 624;
        int d = 1340;
        int x , y, e, f, g;

        x = a;
        y = b;
         e = nod(x , y);

        x = e;
        y = c;
         f = nod(x , y);

        x = f;
        y = d;
         g = nod(x , y);

        System.out.println("НОД чисел " + a + "," + b + "," + c + "," + d + " равен: " + g);
    }


    public static int nod(int x, int y) {
        int k = 0;
        while (x != 0 && y != 0) {
            if (y > x) {
                y %= x;
            } else {
                x %= y;
            }
            k = y + x;
        }
        return k;
    }
}
