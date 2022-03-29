package com.epam.jonline.mod02.c;

public class Task04 {
	public static void main(String[] args) {
		System.out.println(
				"4.  Сортировка  обменами.  Дана  последовательность  чисел  a1 <= a2 <= ... <= an .Требуется  переставить  числа  в \n"
						+ "порядке  убывания.  Для  этого  сравниваются  два  соседних  числа  ai и ai+1.  Если  ai < ai+1 ,  то  делается \n"
						+ "перестановка. Так продолжается до тех пор, пока все элементы не станут расположены в порядке убывания. \n"
						+ "Составить алгоритм сортировки, подсчитывая при этом количества перестановок. ");
		System.out.println();

		int[] z = { 1, 6, 7, 11, 17, 25 };
		boolean s = false;
		int t;
		int c = 0;

		while (!s) {
			s = true;
			for (int j = 0; j < z.length - 1; j++)
				if (z[j] < z[j + 1]) {
					t = z[j];
					z[j] = z[j + 1];
					z[j + 1] = t;
					c++;
					s = false;
				}
		}

		for (int i = 0; i < z.length; i++) {
			System.out.print(z[i] + " ");
		}
		System.out.println();
		System.out.println("количество перестановок " + c);
	}
}
