package com.epam.jonline.mod03.c;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task02 {
	
	/*2.  Дана строка, содержащая следующий текст (xml-документ): 
 
<notes> 
   <note id = "1"> 
       <to>Вася</to> 
       <from>Света</from> 
       <heading>Напоминание</heading> 
       <body>Позвони мне завтра!</body> 
   </note> 
   <note id = "2"> 
       <to>Петя</to> 
       <from>Маша</from> 
       <heading>Важное напоминание</heading> 
       <body/> 
   </note> 
</notes> 
 
Напишите анализатор, позволяющий последовательно возвращать содержимое узлов xml-документа и его тип (открывающий 
тег, закрывающий тег, содержимое тега, тег без тела). Пользоваться готовыми парсерами XML для решения данной задачи 
нельзя.*/

	public static void main(String[] args) {
		
		String s = "<notes> \r\n"
				+ "   <note id = \"1\"> \r\n"
				+ "       <to>Вася</to> \r\n"
				+ "       <from>Света</from> \r\n"
				+ "       <heading>Напоминание</heading> \r\n"
				+ "       <body>Позвони мне завтра!</body> \r\n"
				+ "   </note> \r\n"
				+ "   <note id = \"2\"> \r\n"
				+ "       <to>Петя</to> \r\n"
				+ "       <from>Маша</from> \r\n"
				+ "       <heading>Важное напоминание</heading> \r\n"
				+ "       <body/> \r\n"
				+ "   </note> \r\n"
				+ "</notes>";
		
		Pattern p = Pattern.compile("((?<open><[^/>]+?>)(?<body>.+?)(?<close></.+?>))|(?<openOnly><[^/>]+?>)|(?<closeOnly></.+?>)|(?<noBody><.+?/>)");
		Matcher m = p.matcher(s);
		
		  while (m.find()) {
	            if (m.group("open") != null && m.group("close") != null) {
	                System.out.println("Open tag: " + m.group("open") + " Close tag: " + m.group("close") + " тело тега: " + m.group("body"));
	            } else if (m.group("close") == null && m.group("openOnly") != null) {
	                System.out.println("Open tag: " + m.group("openOnly"));
	            } else if (m.group("open") == null && m.group("closeOnly") != null) {
	                System.out.println("Close tag: " + m.group("closeOnly"));
	            } else if (m.group("noBody") != null) {
	                System.out.println("Tag without body: " + m.group("noBody"));
	            }

	        }
	}
}
