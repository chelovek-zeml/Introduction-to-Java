package com.epam.jonline.mod02.d;

public class Task12 {
	public static void main(String[] args) {
		System.out.println(
				"12. Даны натуральные числа К и N. Написать метод(методы) формирования массива А, элементами которого \n"
						+ "являются числа, сумма цифр которых равна К и которые не больше N.");
		System.out.println();

		int N = 121;
		int K = 9;
		int z = size(K, N);
		int[] A = new int[z];
		int s;
		int n = 0;

		for (int i = 0; i <= N; i++) {
			s = sum(i);
			if (s == K) {
				A[n] = i;
				n++;
			}
		}
		System.out.println();
		for (int j = 0; j < A.length; j++) {
			System.out.print(A[j] + " ");
		}
	}

	public static int size(int K, int N) {

		int s;
		int n = 0;

		for (int i = 0; i <= N; i++) {
			s = sum(i);
			if (s == K) {
				n++;
			}
		}
		return n;
	}

	public static int sum(int i) {

		int n = 0;

		while (i > 0) {
			n = n + i % 10;
			i = i / 10;
		}
		return n;
	}
}
