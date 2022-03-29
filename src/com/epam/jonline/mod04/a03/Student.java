package com.epam.jonline.mod04.a03;

class Student {

	private String name;
	private String inicial;
	private String group;
	private int grade[];
	private int n;

	public Student(String name, String inicial, String group) {
		this.name = name;
		this.inicial = inicial;
		this.group = group;
		n = 0;
		grade = new int[5];
	}

	boolean x(int y) {
		 if(n >= 5) {
			return false;
		 }
		 grade[n] = y;
		 n++;
		 return true;
	 }
	
	boolean z() {
		for(int i = 0; i < n; i++) 
			if(grade[i] != 9 && grade[i] != 10) 
				return false;
		return true;
	}
	
	void print() {
		System.out.printf("%-10s%-8s",name,inicial);
		System.out.print("Группа  " + group + "  Оценки: ");
		for(int i = 0; i < n; i++)
		System.out.printf("%-5s",Integer.toString(grade[i]) + " ");
		System.out.println();
	}

}
