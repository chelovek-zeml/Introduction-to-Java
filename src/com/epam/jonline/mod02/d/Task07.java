package com.epam.jonline.mod02.d;

public class Task07 {
	public static void main(String[] args) {
        System.out.println("7. Написать метод(методы) для вычисления суммы факториалов всех нечетных чисел от 1 до 9");
        System.out.println();
        int n = 1;
        int sum = 0;
        int k = 0;

        for (int i = 0; i < 10; i++) {
            if (i % 2 != 0) {
                k = f(i, n);
                sum = sum + k;
            }
        }
        System.out.println(sum);
    }

    public static int f(int i, int n) {
        while (i > 0) {
            n = n * i;
            i--;
        }
        System.out.println(n);
        return n;
    }
}
