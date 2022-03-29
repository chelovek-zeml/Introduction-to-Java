package com.epam.jonline.mod01.a;

/*3. Вычислить значение выражения по формуле (все переменные принимают действительные значения): 
((sin x + cos y)/ (cos x - sin y)) * tg(x*y)
*/

public class Task03 {
	public static void main(String[] args) {

		int x = 30;
		int y = 60;
		double z;

		z = ((Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y))) * Math.tan(x * y);

		System.out.println(z);
	}

}
