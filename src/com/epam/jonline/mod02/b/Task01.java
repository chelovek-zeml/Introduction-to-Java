package com.epam.jonline.mod02.b;

public class Task01 {
	public static void main(String[] args) {
        System.out.println("1.Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего.");
        System.out.println();
        int[][] x = {{21, 51, 61, 31, 71}, {52, 82, 42, 52, 72}, {93, 13, 63, 73, 33}, {64, 34, 44, 74, 44}, {75, 45, 35, 15, 25}};

        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
                System.out.print(x[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println();
        for (int i = 0; i < x.length; i++) {
            if (i % 2 != 0) {
                for (int j = 0; j < x[i].length; j++)
                    if (x[0][i] > x[x.length - 1][i]) {
                        System.out.println(x[j][i]);
                    }
                System.out.println();
            }
        }

    }
}
