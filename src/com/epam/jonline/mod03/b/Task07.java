package com.epam.jonline.mod03.b;

public class Task07 {

	/*
	 * 7. Вводится строка. Требуется удалить из нее повторяющиеся символы и все
	 * пробелы. Например, если было введено "abc cde
	 * def", то должно быть выведено "abcdef".
	 */

	public static void main(String[] args) {

		String st = "abc cde def";

		st = st.replaceAll(" ", "").replaceAll("(.)(?=.*\\1)", "");

		System.out.println(st);
	}

}
