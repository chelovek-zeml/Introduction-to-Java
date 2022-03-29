package com.epam.jonline.mod02.b;

public class Task05 {
	public static void main(String[] args) {
        System.out.println("5. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное)");
        System.out.println("| 1    1   1   ...   1   1   1|");
        System.out.println("| 2    2   2   ...   2   2   0|");
        System.out.println("| 3    3   3   ...   3   0   0|");
        System.out.println("| :    :   :   '.    :   :   :|");
        System.out.println("|n-1  n-1  0   ...   0   0   0|");
        System.out.println("| n    0   0   ...   0   0   0|");
        System.out.println();

        int n;
        n = 8;
        int[][] x = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                x[i][j] = 1 + i;
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j >= n - i) {
                    x[i][j] = 0;
                }
                System.out.print(x[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
