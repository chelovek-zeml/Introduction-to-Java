package com.epam.jonline.mod01.b;

/*2. Найти max{min(a, b), min(c, d)}*/

public class Task02 {
    public static void main(String[] args) {

        int a = 3;
        int b = 6;
        int c = 4;
        int d = 9;
        int min1;
        int min2;

        if (a < b) {
            min1 = a;
        } else min1 = b;

        if (c < d) {
            min2 = c;
        } else min2 = d;

        if (min1 > min2) {
            System.out.println("Максимальное значение: " + min1);
        } else System.out.println("Максимальное значение: " + min2);
    }
}
