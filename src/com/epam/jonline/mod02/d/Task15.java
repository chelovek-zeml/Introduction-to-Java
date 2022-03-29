package com.epam.jonline.mod02.d;

public class Task15 {
	public static void main(String[] args) {
        System.out.println("15.  Найти  все  натуральные  n-значные  числа,  цифры  в  которых  образуют  строго  возрастающую \n" +
                "последовательность (например, 1234, 5789). Для решения задачи использовать декомпозицию.");
        System.out.println();

        int t = 5;
        int k = 0;
        int x = 0;
        int s;

        int n = t - 1;
        for (int i = 1; i < (10 - n); i++) {
            s = num(n, k, i, x);
            System.out.print(s + " ");
        }
    }


    public static int num(int n, int k, int i, int x) {

        while (n >= 0) {
            x = x + (i + k) * (int) Math.pow(10, n);
            k++;
            n--;
        }
        return x;
    }
}
