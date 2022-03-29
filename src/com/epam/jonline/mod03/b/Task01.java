package com.epam.jonline.mod03.b;

public class Task01 {
	public static void main(String[] args) {

		System.out.println("1. Дан текст (строка). Найдите наибольшее количество подряд идущих пробелов в нем");
		System.out.println();

		String st = "Осенью   небо пасмурное,     затянуто тяжёлыми       тучами.";
		System.out.println("Строка: " + st);
		int count = 0;

		String[] S = st.split("\\S");
		for (String str : S) {
			if (count < str.chars().count()) {
				count = (int) str.chars().count();
			}
		}
			System.out.println("наибольшее количество подряд идущих пробелов: " + count);
		
	}

}
