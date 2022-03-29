package com.epam.jonline.mod02.a;

import java.util.Scanner;

public class Task05 {
	public static void main(String[] args) {
		System.out.println(
				"5.Даны целые числа a1, a2, a3, ... , an. Вывести на печать только те числа, для которых аi > i");
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
		System.out.println();
		for (int i = 0; i < N; i++) {
			if (A[i] > i) {
				System.out.print(" " + A[i]);
			}
		}
		num.close();
	}

}
