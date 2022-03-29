package com.epam.jonline.mod02.a;

import java.util.Scanner;

public class Task04 {
	public static void main(String[] args) {
        System.out.println("4.Дана действительные числа a1, a2, a3, ... , an. Поменять местами наибольший и наименьший элементы");
        System.out.println();
        Scanner num = new Scanner(System.in);
        System.out.print("Введите длину последовательности : ");
        int N = num.nextInt();
        int[] A = new int[N];
        System.out.println("Введите элементы массива: ");
        for (int i = 0; i < N; i++) {
            A[i] = num.nextInt();
        }
        System.out.println();
        System.out.println("Введенные элементы массива :");
        for (int i = 0; i < N; i++) {
            System.out.print(" " + A[i]);
        }
        int x = A[0];
        int imax = 0;
        int y = A[0];
        int imin = 0;
        System.out.println();
        for (int i = 0; i < N; i++) {
            if (A[i] > x) {
                x = A[i];
                imax = i;
            }
            if (A[i] < y) {
                y = A[i];
                imin = i;
            }
        }
        A[imin] = x;
        A[imax] = y;
        for (int i = 0; i < N; i++) {
            System.out.print(" " + A[i]);
        }
        num.close();
    }
}
