package com.epam.jonline.mod02.b;

public class Task07 {
	public static void main(String[] args) {
        System.out.println("7. Сформировать квадратную матрицу порядка N по правилу:");
        System.out.println("A[i,j] = sin ((i*i-j*j)/n)");
        System.out.println("и подсчитать количество положительных элементов в ней.");
        System.out.println();

        int x = 0;
        int n = 8;
        double[][] A = new double[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                A[i][j] = Math.sin((i * i - j * j) / n);
                if (A[i][j] > 0) {
                    x++;
                }
                System.out.print(A[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("количество положительных элементов: " + x);
    }
}
