package com.epam.jonline.mod02.b;

public class Task04 {
	public static void main(String[] args) {
		System.out.println("4. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):");
		System.out.println("|1   2    3  ...  n|");
		System.out.println("|n  n-1  n-2 ...  1|");
		System.out.println("|1   2    3  ...  n|");
		System.out.println("|n  n-1  n-2 ...  1|");
		System.out.println("|:   :    :  '.   :|");
		System.out.println("|n  n-1  n-2 ...  1|");
		System.out.println();

		int n;
		n = 6;
		int[][] x = new int[n][n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i % 2 == 0) {
					x[i][j] = (n * i + j) + 1;
				} else {
					x[i][j] = n - (i * j);
				}
			}
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i % 2 == 0) {
					x[i] = x[0];
				} else
					x[i] = x[1];
				System.out.printf("%3d",x[i][j]);
			}
			System.out.println();
		}
	}
}
