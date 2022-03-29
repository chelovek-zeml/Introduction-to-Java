package com.epam.jonline.mod02.c;

public class Task08 {
	public static void main(String[] args) {
		System.out.println(
				"8.Даны дроби p1/q1 , p2/q2 , ... , pn/qn( pi, qi  - натуральные). Составить программу, которая приводит эти дроби к общему \n"
						+ "знаменателю и упорядочивает их в порядке возрастания");
		System.out.println();

		int[] x = { 1, 3, 2, 4 };
		int[] y = { 2, 4, 3, 5 };
		int n = 1;
		boolean s = false;
		int t;

		for (int i = 0; i < x.length; i++) {
			System.out.print(x[i] + "/" + y[i] + "; ");
			n = n * y[i];
		}

		for (int i = 0; i < x.length; i++) {
			x[i] = (n / y[i]) * x[i];
			y[i] = n;
		}

		System.out.println();
		for (int i = 0; i < x.length; i++)
			System.out.print(x[i] + "/" + y[i] + "; ");

		while (!s) {
			s = true;
			for (int j = 0; j < x.length - 1; j++)
				if (x[j] > x[j + 1]) {
					t = x[j];
					x[j] = x[j + 1];
					x[j + 1] = t;
					s = false;
				}
		}

		System.out.println();
		for (int i = 0; i < x.length; i++)
			System.out.print(x[i] + "/" + y[i] + "; ");
	}
}
