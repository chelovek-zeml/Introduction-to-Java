package com.epam.jonline.mod03.b;

public class Task04 {
	public static void main(String[] args) {

		System.out.println(
				"4. С помощью функции копирования и операции конкатенации составить из частей слова “информатика” слово “торт”.");
		System.out.println();

		String st1 = "информатика";
		String st2 = "торт";

		StringBuffer sb = new StringBuffer();

		for (int i = 0; i < st2.length(); i++) {

			if (!st1.contains(String.valueOf(st2.charAt(i)))) {
				System.out.println("Нельзя составить из слова " + st1 + " слово " + st2);
			}
			sb.append(String.copyValueOf(st1.toCharArray(), st1.indexOf(st2.charAt(i)), 1));
		}
		System.out.println("Можно составить из слова " + st1 + " слово " + st2);
	}
}
