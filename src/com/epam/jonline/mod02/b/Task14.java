package com.epam.jonline.mod02.b;

public class Task14 {
	 public static void main(String[] args) {
	        System.out.println("14. Сформировать случайную матрицу m x n, состоящую из нулей и единиц, причем в каждом столбце число \n" +
	                "единиц равно номеру столбца");
	        System.out.println();

	        int m;
	        int n;
	        m = (int) (Math.random() * (9 - 5) + 5);
	        n = (int) (Math.random() * (m - 2) + 2);
	        System.out.println("m = " + m);
	        System.out.println("n = " + n);
	        System.out.println();

	        if (m >= n) {
	            int[][] x = new int[m][n];
	            for (int i = 0; i < x.length; i++) {
	                for (int j = 0; j < x[i].length; j++) {
	                    if(j >= i){
	                        x[i][j] = 1;
	                    }
	                    System.out.printf("%3d",x[i][j]);
	                }
	                System.out.println();
	            }
	        }
	    }
}
