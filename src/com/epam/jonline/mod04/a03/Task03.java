package com.epam.jonline.mod04.a03;

import java.util.Random;

public class Task03 {

	public static void main(String[] args) {

		System.out.println("3. Создайте класс с именем Student, содержащий поля: фамилия и инициалы, номер группы, успеваемость (массив \r\n" + 
				"из пяти элементов). Создайте массив из десяти элементов такого типа. Добавьте возможность вывода фамилий и \r\n" + 
				"номеров групп студентов, имеющих оценки, равные только 9 или 10.");
		System.out.println();

		int m = 10;
		Student A[] = new Student[m];

		A[0] = new Student("Серов", "П.Н.", "m1");
		A[1] = new Student("Белов", "К.С.", "m1");
		A[2] = new Student("Иванов", "А.Н.", "m1");
		A[3] = new Student("Петров", "Л.О.", "m2");
		A[4] = new Student("Крылов", "В.Ю.", "m2");
		A[5] = new Student("Светлов", "А.К.", "m2");
		A[6] = new Student("Широкий", "Т.Р.", "m3");
		A[7] = new Student("Твердый", "Н.М.", "m3");
		A[8] = new Student("Смелый", "М.С.", "m3");
		A[9] = new Student("Волк", "Г.Л.", "m3");

		Random rnd = new Random();
		for (int i = 0; i < m; ++i) {
			int k = 0;
			while(k < 5) {
			A[i].x(rnd.nextInt(3) + 8);
			k++;
			}
		}
		
		System.out.println();
		System.out.println("все студенты: ");
		System.out.println();
		for (int i = 0; i < m; ++i) {
			A[i].print();
		}
		
		System.out.println();
		System.out.println("хорошие студенты: ");
		System.out.println();
		for (int i = 0; i < m; ++i) {
			if (A[i].z())
				A[i].print();
		}
	}
}
