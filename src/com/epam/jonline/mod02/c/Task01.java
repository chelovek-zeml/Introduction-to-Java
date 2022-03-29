package com.epam.jonline.mod02.c;

public class Task01 {
	public static void main(String[] args) {
		System.out.println(
				"1. Заданы два одномерных массива с различным количеством элементов и натуральное число k. Объединить их в \n"
						+ "один  массив,  включив  второй  массив  между  k-м  и  (k+1)  -  м  элементами  первого,  при  этом  не  используя \n"
						+ "дополнительный массив.");
		System.out.println();

		int k = 3;
		int n = 0;
		int[] x = { 1, 2, 3, 4, 5 };
		int[] y = { 9, 8, 7, 6 };
		int[] z = new int[x.length + y.length];

		for (int i = 0; i < z.length; i++) {
			if (k > i) {
				z[i] = x[i];
			} else if (n < y.length) {
				z[i] = y[n];
				n++;
			} else
				z[i] = x[i - y.length];
		}
		for (int j = 0; j < z.length; j++) {
			System.out.print(z[j] + " ");
		}
	}
}
