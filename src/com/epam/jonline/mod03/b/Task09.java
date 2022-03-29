package com.epam.jonline.mod03.b;

public class Task09 {
	/*
	 * 9. Посчитать количество строчных (маленьких) и прописных (больших) букв в
	 * введенной строке. Учитывать только английские буквы.
	 */

	public static void main(String[] args) {

		String str = "1. Hello World, Привет МИР!";
		System.out.println(str);

		str = str.replaceAll("[^a-zA-Z]", "");
		System.out.println();

		int size = str.length();
		System.out.println("количество строчных (маленьких) и прописных (больших) букв в\r\n"
				+ "введенной строке(Учитывая только английские буквы): " + size);

	}

}
