package com.epam.jonline.mod02.b;

public class Task03 {
	public static void main(String[] args) {
        System.out.println("3. Дана матрица. Вывести k-ю строку и p-й столбец матрицы");
        System.out.println();

        int k = 1;
        int p = 2;
        int[][] x = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
                System.out.printf("%3d", x[i][j]);
            }
            System.out.println();
        }

        System.out.println();
        for (int j = 0; j < x.length; j++) {
            System.out.printf("%3d", x[k - 1][j]);
        }
        System.out.println();

        System.out.println();
        for (int i = 0; i < x.length; i++) {
            System.out.printf("%3d", x[i][p - 1]);
            System.out.println();
        }
    }
}
