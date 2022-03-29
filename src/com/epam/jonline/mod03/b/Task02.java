package com.epam.jonline.mod03.b;

public class Task02 {
	public static void main(String[] args) {

		System.out.println("2. В строке вставить после каждого символа 'a' символ 'b'.");
		System.out.println();
		
		String s = "Солнце почти не выглядывает из-за туч.";
		System.out.println("Строка: " + s);
		System.out.println();
		System.out.println(s.replaceAll("а", "аb"));
	}
}
