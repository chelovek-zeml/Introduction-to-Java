package com.epam.jonline.mod03.a;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task01 {

	public static void main(String[] args) {
		System.out.println("1. Дан массив названий переменных в camelCase. Преобразовать названия в snake_case.");
		System.out.println();

		String[] st = { "LastName", "FirstName", "SomeName" };

		System.out.print("[");
		for (int i = 0; i < st.length; i++) {
			System.out.print(" " + st[i] + " ");
		}
		System.out.println("]");

		Pattern p = Pattern.compile("\\B([A-Z])");
		for (int i = 0; i < st.length; i++) {
			Matcher m = p.matcher(st[i]);
			StringBuffer sb = new StringBuffer();
			while (m.find()) {
				m.appendReplacement(sb, "_$0");
			}
			m.appendTail(sb);
			st[i] = sb.toString().toLowerCase();
		}
		System.out.println(Arrays.toString(st));
	}
}
