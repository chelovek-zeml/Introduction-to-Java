package com.epam.jonline.mod01.a;

/*4. Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях). Поменять местами 
дробную и целую части числа и вывести полученное значение числа.*/

public class Task04 {
	public static void main(String[] args) {

		double R = 111.222;
	
		R = (R * 1000)%1000 + ((int)R) * 1.0 / 1000;
		
		System.out.println(R);

	}

}
