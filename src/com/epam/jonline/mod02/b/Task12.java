package com.epam.jonline.mod02.b;

public class Task12 {
	public static void main(String[] args) {
		System.out.println("12. Отсортировать строки матрицы по возрастанию и убыванию значений элементов.");
		System.out.println();

		int temp = 0;
		int n = 5;
		int[][] x = new int[n][n];

		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x[i].length; j++) {
				x[i][j] = (int) (Math.random() * 10);
				System.out.printf("%3d",x[i][j]);
			}
			System.out.println();
		}

		System.out.println();
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x[i].length; j++) {
				for (int k = j + 1; k < x.length; k++) {
					if (x[i][j] > x[i][k]) {
						temp = x[i][j];
						x[i][j] = x[i][k];
						x[i][k] = temp;
					}
				}
				System.out.printf("%3d",x[i][j]);
			}
			System.out.println();
		}

		System.out.println();
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x[i].length; j++) {
				for (int k = j + 1; k < x.length; k++) {
					if (x[i][j] < x[i][k]) {
						temp = x[i][j];
						x[i][j] = x[i][k];
						x[i][k] = temp;
					}
				}
				System.out.printf("%3d",x[i][j]);
			}
			System.out.println();
		}
	}
}
