package com.epam.jonline.mod02.d;

public class Task01 {
	public static void main(String[] args) {
		System.out.println(
				"1. Написать метод(методы) для нахождения наибольшего общего делителя и наименьшего общего кратного двух \n"
						+ "натуральных чисел: НОК(А,B) = (A * B) / НОД (A,B)");
		System.out.println();

		int A = 224;
		int B = 64;
		int C = algorithmEvklid(A, B);
		System.out.println("НОД чисел " + A + " и " + B + " равен: " + C);
		System.out.println("НОК чисел " + A + " и " + B + " равен: " + (A * B) / C);
	}

	public static int algorithmEvklid(int A, int B) {
		int d = 0;
		while (B != 0 && A != 0) {
			if (A > B) {
				A %= B;
			} else {
				B %= A;
			}
			d = A + B;
		}
		return d;
	}
}
