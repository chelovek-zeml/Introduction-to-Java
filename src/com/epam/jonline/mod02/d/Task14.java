package com.epam.jonline.mod02.d;

public class Task14 {
	public static void main(String[] args) {
        System.out.println("14.  Натуральное  число,  в  записи  которого  n  цифр,  называется  числом  Армстронга,  если  сумма  его  цифр, \n" +
                "возведенная  в  степень  n,  равна  самому  числу.  Найти  все  числа  Армстронга  от  1  до  k.  Для  решения  задачи \n" +
                "использовать декомпозицию.");
        System.out.println();

        int k = 100000;
        int n = 0;
        int t = 0;
        int s, x;

        System.out.println("числа  Армстронга от 1 до " + k + " :");
        for (int i = 0; i <= k; i++) {
            x = rate(i, n);
            s = sum(i, t, x);
            if (s == i) {
                System.out.print(i + "  ");
            }
        }
    }

    public static int sum(int i, int t, int x) {
        while (i > 0) {
            t = t + (int) Math.pow((i % 10), x);
            i = i / 10;
        }
        return t;
    }

    public static int rate(int i, int n) {
        while (i > 0) {
            i = i / 10;
            n++;
        }
        return n;
    }
}
