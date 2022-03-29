package com.epam.jonline.mod02.c;

public class Task06 {
	public static void main(String[] args) {
		System.out.println(
				"6.  Сортировка  Шелла.  Дан  массив  n  действительных  чисел.  Требуется  упорядочить  его  по  возрастанию. \n"
						+ "Делается это следующим образом: сравниваются два соседних элемента  ai и ai+1. Если  ai <= ai+1 , то продвигаются \n"
						+ "на  один  элемент  вперед.  Если  ai > ai+1 ,  то  производится  перестановка  и  сдвигаются  на  один  элемент  назад. \n"
						+ "Составить алгоритм этой сортировки. \n");
		System.out.println();

		int[] x = { 4, 7, 9, 5, 3, 5, 8, 1, 6, 4, 8, 12, 15, 17, 23, 28, 35, 38, 32, };
		int h = 0;
		int t;

		while (h <= x.length / 3)
			h = 3 * h + 1;

		for (int i = h; i > 0; i = (i - 1) / 3)
			for (int j = i; j < x.length; j++) {
				t = x[j];
				int k;
				for (k = j; k >= i; k -= i) {
					if (t < x[k - i])
						x[k] = x[k - i];
					else
						break;
				}
				x[k] = t;
			}

		for (int i = 0; i < x.length; i++)
			System.out.print(x[i] + " ");

	}
}
