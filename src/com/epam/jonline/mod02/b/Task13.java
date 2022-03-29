package com.epam.jonline.mod02.b;

public class Task13 {
	public static void main(String[] args) {
		System.out.println("13. Отсотрировать стобцы матрицы по возрастанию и убыванию значений эементов");
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
				for (int k = i + 1; k < x.length; k++) {
					if (x[i][j] > x[k][j]) {
						temp = x[i][j];
						x[i][j] = x[k][j];
						x[k][j] = temp;
					}
				}
				System.out.printf("%3d",x[i][j]);
			}
			System.out.println();
		}

		System.out.println();
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x[i].length; j++) {
				for (int k = i + 1; k < x.length; k++) {
					if (x[i][j] < x[k][j]) {
						temp = x[i][j];
						x[i][j] = x[k][j];
						x[k][j] = temp;
					}
				}
				System.out.printf("%3d",x[i][j]);
			}
			System.out.println();
		}
	}
}
