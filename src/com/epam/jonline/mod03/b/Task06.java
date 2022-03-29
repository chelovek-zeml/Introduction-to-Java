package com.epam.jonline.mod03.b;

public class Task06 {
	public static void main(String[] args) {

		System.out.println("6. Из заданной строки получить новую, повторив каждый символ дважды.");
		System.out.println();

		String st = "Дрожит серая осинка.";
		System.out.println("Строка: " + st);
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < st.length(); i++) {
			sb.append(st.charAt(i));
			sb.append(st.charAt(i));
		}

		System.out.println(sb);
	}

}
