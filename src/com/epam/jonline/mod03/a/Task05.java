package com.epam.jonline.mod03.a;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task05 {
	public static void main(String[] args) {
		System.out.println("5.  Удалить в  строке  все  лишние  пробелы,  то  есть  серии  подряд  идущих  пробелов  заменить на  одиночные  пробелы. \n" +
                "Крайние пробелы в строке удалить.");
        System.out.println();

        String[] st = {"  Удалить" + " в" + "  строке" + "  все" + "  лишние" + "  пробелы," + "  то" + "  есть" + "  серии" + "  подряд" + "  идущих" +
                "  пробелов" + "  заменить" + " на" + "  одиночные" + "  пробелы." + " Крайние" + " пробелы" + " в" + " строке" + " удалить."};
        System.out.print("[");
        for (int i = 0; i < st.length; i++) {
            System.out.print(" " + st[i] + " ");
        }
        System.out.println("]");
        
        Pattern p = Pattern.compile("\\s+");
        for (int i = 0; i < st.length; i++) {
        	Matcher m = p.matcher(st[i]);
        	StringBuffer sb = new StringBuffer();
        	while(m.find()) {
        		m.appendReplacement(sb, " ");
        	}
        	m.appendTail(sb);
        	st[i] = sb.toString().trim();
        }
        System.out.println(Arrays.toString(st));
	}

}
