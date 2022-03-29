package com.epam.jonline.mod02.b;

public class Task09 {
	public static void main(String[] args) {
        System.out.println("9. Задана матрица неотрицательных чисел. Посчитать сумму элементов в каждом столбце. Определить, какой \n" +
                "столбец содержит максимальную сумму. \n");
        System.out.println();

        int[][] x = {{9, 4, 5, 7}, {8, 2, 3, 4}, {1, 2, 5, 7}, {4, 6, 3, 2}};
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;

        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
                System.out.print(x[i][j] + "\t");
                a += x[i][0];
                b += x[i][1];
                c += x[i][2];
                d += x[i][3];
            }
            System.out.println();
        }

        System.out.println();
        int z = Math.max(Math.max(a, b), Math.max(c, d));
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length;) {
                if (z == a) {
                    System.out.println(x[i][0]);
                    break;
                }
                if (z == b) {
                    System.out.println(x[i][1]);
                    break;
                }
                if (z == c) {
                    System.out.println(x[i][2]);
                    break;
                } else
                    System.out.println(x[i][3]);
                break;
            }
        }
        
    }
}
