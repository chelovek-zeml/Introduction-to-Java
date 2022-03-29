package com.epam.jonline.mod02.b;

import java.util.Scanner;

public class Task08 {
	public static void main(String[] args) {
		System.out.println(
				"8. В числовой матрице поменять местами два столбца любых столбца, т. е. все элементы одного столбца поставить \n"
						+ "на соответствующие им позиции другого, а его элементы второго переместить в первый. Номера столбцов вводит \n"
						+ "пользователь с клавиатуры. \n");
		System.out.println();

		Scanner num = new Scanner(System.in);
		int a;
		int b;
		int n = 6;
		int[][] x = new int[n][n];

		System.out.print("Введите номер столбца a: ");
		if (!num.hasNextInt()) {
			System.out.print("Вы допустили ошибку при вводе числа. Попробуйте еще раз.");
			num.next();
		}
		a = num.nextInt() - 1;

		System.out.print("Введите номер столбца b: ");
		if (!num.hasNextInt()) {
			System.out.print("Вы допустили ошибку при вводе числа. Попробуйте еще раз: ");
			num.next();
		}
		b = num.nextInt() - 1;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				x[i][j] = j + 1;
				System.out.print(x[i][j] + "\t");
			}
			System.out.println();
		}

		System.out.println();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (j == a) {
					int y = x[i][j];
					x[i][j] = x[i][b];
					x[i][b] = y;
				}
				System.out.print(x[i][j] + "\t");
			}
			System.out.println();
		}
		num.close();

	}
}
