package com.epam.jonline.mod02.c;

public class Task02 {
	public static void main(String[] args) {
		System.out.println(
				"2. Даны две последовательности a1 <= a2 <= ... <= an и b1 <= b2 <= ... <= bn . Образовать из них новую последовательность \n"
						+ "чисел так, чтобы она тоже была неубывающей. Примечание. Дополнительный массив не использовать");
		System.out.println();

		int[] x = new int[] { 1, 2, 3, 5, 7, 9, 13 };
		int[] y = new int[] { 3, 8, 9, 12, 15, 17, 23 };
		int c = 0;
		int[] z = new int[x.length + y.length];
		boolean s = false;
		int t;

		for (int i = 0; i < x.length; i++) {
			z[i] = x[i];
			c++;
		}

		for (int j = 0; j < y.length; j++) {
			z[c++] = y[j];
		}

		while (!s) {
			s = true;
			for (int j = 0; j < z.length - 1; j++)
				if (z[j] > z[j + 1]) {
					t = z[j];
					z[j] = z[j + 1];
					z[j + 1] = t;
					s = false;
				}
		}

		for (int i = 0; i < z.length; i++) {
			System.out.print(z[i] + " ");
		}
	}
}
