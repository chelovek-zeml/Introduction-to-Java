package com.epam.jonline.mod02.d;

public class Task10 {
	public static void main(String[] args) {
        System.out.println("10.  Дано  натуральное  число  N.  Написать  метод(методы)  для  формирования  массива,  элементами  которого \n" +
                "являются цифры числа N.");
        System.out.println();

        int a = 1234567;
        int k = 0;
        int n = value(a, k);
        int[] x = new int[n];

        for (int i = 0; i < x.length; i++) {
            x[i] = a / (int) Math.pow(10, n - 1);
            a = a - x[i] * (int) Math.pow(10, n - 1);
            n = n - 1;
            System.out.print(x[i] + " ");
        }
    }

    public static int value(int a, int k) {
        while (a != 0) {
            a = a / 10;
            k++;
        }
        return k;
    }
}
