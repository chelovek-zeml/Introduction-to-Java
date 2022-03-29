package com.epam.jonline.mod04.a01;

 class Test1 {
	public int a;
	public int b;

	public int max () {
		
		if(a > b)
			return a;
		return b;
	}

	public int sum() {
		
		return a + b;
	}

	public void print() {
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("sum = " + sum());
		System.out.println("max = " + max());
	}
}
