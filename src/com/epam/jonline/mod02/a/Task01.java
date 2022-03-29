package com.epam.jonline.mod02.a;

import java.util.Scanner;

public class Task01 {

	public static void main(String[] args) {
		System.out.println("В массив A[N] занесены числа. Найти сумму тех элементов, которые кратны данному K");
		System.out.println();
		Scanner num = new Scanner(System.in);
		System.out.print("Введите значение K: ");
		int K = num.nextInt();
		System.out.print("Введите длину массива A[N]: ");
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
		System.out.println();
		System.out.println();
		for (int i = 0; i < A.length; i++)
			for (int j = 0; j != i; j++) {
				if ((A[i] + A[j]) % K == 0) {
					System.out.println("сумма  " + A[i] + " и " + A[j] + " кратна " + K);
				}
			}
		num.close();
	}
}
