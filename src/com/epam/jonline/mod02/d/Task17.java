package com.epam.jonline.mod02.d;

public class Task17 {
	public static void main(String[] args) {
        System.out.println("17. Из заданного числа вычли сумму его цифр. Из результата вновь вычли сумму его цифр и т.д. Сколько таких \n" +
                "действий надо произвести, чтобы получился нуль? Для решения задачи использовать декомпозицию. ");
        System.out.println();

        int k;
        int n = 25;
        int t = 0;

        System.out.println("Для числа " + n + " нужно произвести :");
        while (n != 0) {
            k = sum(n);
            n = n - k;
            t++;
        }
        System.out.print(t + " операции, чтобы получился нуль.");
    }

    public static int sum(int n) {
        int s = 0;
        while (n > 0) {
            s = s + n % 10;
            n = n / 10;
        }
        return s;
    }
}
