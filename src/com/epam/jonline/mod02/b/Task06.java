package com.epam.jonline.mod02.b;

public class Task06 {
	public static void main(String[] args) {
        System.out.println("6. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):");
        System.out.println("| 1    1   1   ...   1   1   1|");
        System.out.println("| 0    1   1   ...   1   1   0|");
        System.out.println("| 0    0   1   ...   1   0   0|");
        System.out.println("| :    :   :   '.    :   :   :|");
        System.out.println("| 0    1   1   ...   1   1   0|");
        System.out.println("| 1    1   1   ...   1   1   1|");
        System.out.println();

        int n;
        n = 8;
        int[][] x = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ((j <= i && i >= n / 2 && j >= n - i - 1) || (j <= n - i - 1 && i <= n / 2 && i <= j))
                    x[i][j] = 1;
                else
                    x[i][j] = 0;
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%3d",x[i][j]);
            }
            System.out.println();
        }
    }
}
