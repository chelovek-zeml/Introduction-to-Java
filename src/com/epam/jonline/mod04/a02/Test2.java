package com.epam.jonline.mod04.a02;

class Test2 {

	private int a;
	private int b;
	
	public Test2() {
		a = 3;
		b = 5;
	}
	
	public Test2(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	public int geta() {
		return a;
	}
	
	public int getb() {
		return b;
	}
	
	public void seta(int a) {
		this.a = a;
	}
	
	public void setb(int b) {
		this.b = b;
	}
	
	void print() {
		System.out.println("a = " + a);
		System.out.println("b = " + b);
	}
}
