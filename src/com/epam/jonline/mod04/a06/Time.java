package com.epam.jonline.mod04.a06;

public class Time {

	private int h;
	private int m;
	private int s;

	public Time(int h_, int m_, int s_) {
		h = h_;
		m = m_;
		s = s_;

		if (h < 0 || h > 23)
			h = 0;
		else
			h = h_;

		if (m < 0 || m > 59)
			m = 0;
		m = m_;

		if (s < 0 || s > 59)
			s = 0;
		s = s_;
	}

	public void addS(int a) {
		s = s + a;
		m = m + s / 60;
		s = s % 60;
		h = h + m / 60;
		m = m % 60;
		h = h % 24;
	}

	public void addM(int m) {
		addS(m * 60);
	}

	public void addH(int h) {
		addS(h * 3600);
	}
	
	void print() {
		System.out.print("Time: ");
		System.out.printf("%02d:%02d:%02d",h,m,s);
		System.out.println();
	}
}
