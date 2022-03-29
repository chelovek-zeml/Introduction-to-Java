package com.epam.jonline.mod02.b;

public class Task10 {
	 public static void main(String[] args) {
	        System.out.println("10. Найти положительные элементы главной диагонали квадратной матрицы.");
	        System.out.println();

	        int[][] x = {{-2, 3, -5, -6, -3, 4}, {5, 6, -6, -4, 3, 2}, {2, 5, 4, 2, 8, 4}, {2, 9, 4, 7, 2, 6}, {-3, -5, -7, -2, -9, -6}, {-3, -6, -3, -7, -5, -9}};
	        for (int i = 0; i < x.length; i++) {
	            for (int j = 0; j < x[i].length; j++) {
	                System.out.printf("%4d", x[i][j]);
	            }
	            System.out.println();
	        }

	        System.out.println();
	        for (int i = 0; i < x.length; i++) {
	            for (int j = 0; j < x[i].length; j++) {
	                if (i == j && x[i][j] > 0) {
	                    System.out.print(x[i][j]);
	                    System.out.print(" ");
	                }
	            }
	        }
	    }
}
