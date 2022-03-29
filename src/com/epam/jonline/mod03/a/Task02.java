package com.epam.jonline.mod03.a;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task02 {
	public static void main(String[] args) {

		 System.out.println("2. Замените в строке все вхождения 'word' на 'letter'");
	        System.out.println();

	        String []st = {"Word", "war", "world", "word", "power", "word", "bord", "word", "body", "lord"};
	        System.out.print("[");
	        for (int i = 0; i < st.length; i++) {
	            System.out.print(" " + st[i] + " ");
	        }
	        System.out.println("]");
	        
	        Pattern p = Pattern.compile("(?i)word");
	        for(int i = 0; i < st.length; i++) {
	        	Matcher m = p.matcher(st[i]);
	        	StringBuffer sb = new StringBuffer();
	        	while(m.find()) {
	        		m.appendReplacement(sb, "letter");
	        	}
	        	m.appendTail(sb);
	        	st[i] = sb.toString();
	        }
	        System.out.println(Arrays.toString(st));
	}
}
