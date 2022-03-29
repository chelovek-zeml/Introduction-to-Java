package com.epam.jonline.mod02.b;

public class Task15 {
	public static void main(String[] args) {
        System.out.println("15. Найдите наибольший элемент матрицы и заменить все нечетные элементы на него.");
        System.out.println();

        int a = 0;
        int[][] x = new int[6][6];


        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
                x[i][j] = (int) (Math.random() * 10);
                if (x[i][j] >= a) {
                    a = x[i][j];
                }
                System.out.print(x[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("max: " + a);


        System.out.println();
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
                if (x[i][j] % 2 != 0) {
                    x[i][j] = a;
                }
                System.out.print(x[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
