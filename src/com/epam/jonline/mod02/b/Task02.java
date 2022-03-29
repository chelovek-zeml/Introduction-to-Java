package com.epam.jonline.mod02.b;

public class Task02 {
	public static void main(String[] args) {
        System.out.println("2. Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.");
        System.out.println();

        int[][] x = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
                System.out.printf("%3d", x[i][j]);
            }
            System.out.println();
        }

        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
                if (i == j) {
                    System.out.print(x[i][j]);
                    System.out.println();
                }
            }
        }

    }
}
