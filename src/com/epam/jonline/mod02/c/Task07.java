package com.epam.jonline.mod02.c;

import java.util.Arrays;

public class Task07 {
	public static void main(String[] args) {
		System.out.println(
				"7.  Пусть  даны  две  неубывающие  последовательности  действительных  чисел a1 <= a2 <= ... <= an и b1 <= b2 <= ... <= bm.\n"
						+ "Требуется указать те места, на которые нужно вставлять элементы последовательности  b1 <= b2 <= ... <= bm в первую \n"
						+ "последовательность так, чтобы новая последовательность оставалась возрастающей. \n");
		System.out.println();

		int[] x = { 2, 7, 13, 16, 19, 25, 31, 56 };
		int[] y = { 1, 5, 6, 25, 32, 47 };

		System.out.println("места, на которые нужно вставлять элементы последовательности  b1 <= b2 <= ... <= bm : ");
		for (int i = 0; i < y.length; i++) {
			int j = Arrays.binarySearch(x, y[i]);
			if (j < 0) {
				j = -j - 1;
			}
			System.out.print(j + "; ");
		}
	}
}
