package com.epam.jonline.mod03.a;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task04 {
	public static void main(String[] args) {
		System.out.println("4. В строке найти количество чисел");
		System.out.println();

		int count = 0;
		String[] st = { "Word4,", " 34,", " war,", " wor7ld,", " 67,", " 983746." };
		System.out.print("[");
		for (int i = 0; i < st.length; i++) {
			System.out.print(" " + st[i] + " ");
		}
		System.out.println("]");

		Pattern p = Pattern.compile("\\d+");

		for(int i = 0; i < st.length; i++) {
			Matcher m = p.matcher(st[i]);
			while(m.find()) {
				count++;
			}
		}
		System.out.println("Количество чисел: " + count);
	}
}
