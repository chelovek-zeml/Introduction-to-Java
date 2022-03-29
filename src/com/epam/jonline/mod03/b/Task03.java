package com.epam.jonline.mod03.b;

public class Task03 {
	public static void main(String[] args) {

		System.out.println("3. Проверить, является ли заданное слово палиндромом");
		System.out.println();

		String[] S = { "absba", "asdf", "rtktr", "isdf" };

		for (String st : S) {
			StringBuffer sb = new StringBuffer(st).reverse();
			String str = sb.toString();
			if (str.equalsIgnoreCase(st)) {
				System.out.println(st + " является палиндромом.");
			} else {
				System.out.println(st + " не является палиндромом.");
			}
		}
	}
}
