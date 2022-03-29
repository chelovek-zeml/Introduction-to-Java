package com.epam.jonline.mod02.c;

public class Task03 {
	public static void main(String[] args) {
		System.out.println(
				"3. Сортировка выбором. Дана последовательность чисел  a1 <= a2 <= ...<= an .Требуется переставить элементы так, \n"
						+ "чтобы они были расположены по убыванию. Для этого в массиве, начиная с первого, выбирается наибольший \n"
						+ "элемент и ставится на первое место, а первый - на место наибольшего. Затем, начиная со второго, эта процедура \n"
						+ "повторяется. Написать алгоритм сортировки выбором.");
		System.out.println();

		int[] x = { 3, 4, 5, 6, 7, 8, 9 };

		for (int i = 0; i < x.length; i++) {
			int max = x[i];
			int m_i = i;

			for (int j = i + 1; j < x.length; j++) {
				if (x[j] > max) {
					max = x[j];
					m_i = j;
				}
			}
			if (i != m_i) {
				int tmp = x[i];
				x[i] = x[m_i];
				x[m_i] = tmp;
			}
			System.out.print(x[i] + " ");
		}
	}
}
