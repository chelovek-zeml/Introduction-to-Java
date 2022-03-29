package com.epam.jonline.mod02.d;

public class Task08 {
	public static void main(String[] args) {
        System.out.println("8. Задан массив D. Определить следующие суммы: D[1] + D[2] + D[3]; D[3] + D[4] + D[5]; D[4] +D[5] +D[6]. \n" +
                "Пояснение. Составить метод(методы) для вычисления суммы трех последовательно расположенных элементов \n" +
                "массива с номерами от k до m. ");
        System.out.println();

        int[] D = {1, 2, 3, 4, 5, 6, 7};
        int k, m;
        int sum;

        for (int i = 0; i < D.length; i++) {
            System.out.print(D[i] + " ");
        }
        System.out.println();

        k = 1;
        m = 3;
        sum = sum(D, k, m);
        System.out.println("Сумма трех элементов с " + k + " элемента массива по " + m + " элемент массива равна " + sum);

        k = 3;
        m = 5;
        sum = sum(D, k, m);
        System.out.println("Сумма трех элементов с " + k + " элемента массива по " + m + " элемент массива равна " + sum);

        k = 4;
        m = 6;
        sum = sum(D, k, m);
        System.out.println("Сумма трех элементов с " + k + " элемента массива по " + m + " элемент массива равна " + sum);
    }

    public static int sum(int D[], int k, int m) {

        int sum = 0;
        for (int i = 0; i < D.length; i++) {
            if (i >= k && i <= m) {
                sum = sum + D[i];
            }
        }
        return sum;
    }
}
