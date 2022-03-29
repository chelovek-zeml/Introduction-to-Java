package com.epam.jonline.mod02.a;

public class Task08 {
	public static void main(String[] args) {
		System.out.println(
				"10.Дан целочисленный массив с количеством элементов n. Сжать массив, выбросив из него каждый второй \n"
						+ "элемент(освободившиеся элементы заполнить нулями). Примечание. Дополнительный массив не использовать.");
		System.out.println();
		int[] A = { 2, 3, 5, 8, 9, 5, 4, 2, 8, 5, 7, 9, 4, 6, 3, };
		for (int i = 0; i < A.length; i++) {
			if ((i + 1) % 2 == 0) {
				A[i] = 0;
			}
			System.out.print(" " + A[i]);
		}
	}
}
