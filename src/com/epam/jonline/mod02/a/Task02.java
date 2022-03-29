package com.epam.jonline.mod02.a;

import java.util.Scanner;

public class Task02 {
	public static void main(String[] args) {
		System.out.println("2.Дана последовательность чисел a1, a2, a3, ... , an. \n"
				+ "Заменить все ее члены большие данного Z, этим числом. Подсчитать количество замен.");
		System.out.println();
		Scanner num = new Scanner(System.in);
		System.out.print("Введите число Z: ");
		int Z = num.nextInt();
		System.out.print("Введите длину последовательности : ");
		int n = num.nextInt();
		int m = 0;
		int[] A = new int[n];
		System.out.println("Введите элементы последовательности: ");
		for (int i = 0; i < n; i++) {
			A[i] = num.nextInt();
		}
		System.out.println();
		System.out.println("Введенные элементы последовательности :");
		for (int i = 0; i < n; i++) {
			System.out.print(" " + A[i]);
		}
		System.out.println();
		for (int i = 0; i < A.length; i++) {
			if (A[i] > Z) {
				A[i] = Z;
				m = m + 1;
			}
			System.out.print(" " + A[i]);
		}
		System.out.println();
		System.out.print("количетсво замен: " + m);
		num.close();
	}
}
