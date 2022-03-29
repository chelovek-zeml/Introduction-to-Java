package com.epam.jonline.mod02.a;

public class Task06 {
	public static void main(String[] args) {
        System.out.println("6.Задана последовательность N вещественных чисел. Вычислить сумму чисел,\n" +
                " порядковые номера которых являются простыми числами. ");
        System.out.println();
        double x = 0;
        double[] A = {1, 2.3, -4.5, 3, 34, 0, 23, 132, -0.5, -34, 56, 6};
        for (int i = 2; i < A.length; i++)
            for (int j = 2; j < A.length; j++) {
                for (int k = 2; k < 11; k++) {
                    if (i % j == 0 && i / j == k) {
                        A[i] = 0;
                    }
                }
                if (i % j == 0 && i / j == 1) {
                    System.out.print(" " + A[i]);
                    x = x + A[i];
                }
            }
        System.out.println();
        System.out.println(x);
    }
}
