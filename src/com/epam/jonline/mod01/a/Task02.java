package com.epam.jonline.mod01.a;

/*2. Вычислить значение выражения по формуле (все переменные принимают действительные значения): 
(b+√(b^2+4ac))/2a - a^3 × c + b^(-2)
*/

public class Task02 {
	public static void main(String[] args) {

		int a = 2;
		int b = 1;
		int c = 3;
		double z;

		z = ((b + Math.sqrt(b * b + 4 * a * c)) / (2 * a)) - ((a * a * a) * c) + (Math.pow(b, -2));

		System.out.println(z);
	}

}
