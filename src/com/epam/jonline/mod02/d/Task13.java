package com.epam.jonline.mod02.d;

public class Task13 {
	public static void main(String[] args) {
		System.out.println(
				"13. Два простых числа называются «близнецами», если они отличаются друг от друга на 2 (например, 41 и 43). \n"
						+ "Найти и напечатать все пары «близнецов» из отрезка [n,2n], где n - заданное натуральное число больше 2. Для \n"
						+ "решения задачи использовать декомпозицию.");
		System.out.println();

		int n = 6;
		int[] x = new int[2 * n - n + 1];
		int k;

		int[] y = mas(n, x);
		System.out.println();
		for (int j = 0; j < x.length; j++) {
			k = y[j] + 2;
			if (k < (2 * n + 1)) {
				System.out.print(y[j] + "-" + k + "   ");
			}
		}
	}

	public static int[] mas(int n, int x[]) {
		for (int i = 0; i < x.length; i++) {
			x[i] = n;
			n++;
			System.out.print(x[i] + " ");
		}
		return x;
	}
}
