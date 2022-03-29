package com.epam.jonline.mod03.b;

public class Task05 {
	public static void main(String[] args) {
		
		System.out.println("5. Подсчитать, сколько раз среди символов заданной строки встречается буква “а”");
		System.out.println();
		
		String st = "Красуется белоствольная берёза с душистыми листочками.";
		System.out.println("Строка: " + st);
		int count = 0;
		
		count = st.length() - st.replaceAll("а", "").length();
		System.out.println("В строке: '" + st + "' буква “а” встречается: " + count + " раз(а)");
	}
}
