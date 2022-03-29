package com.epam.jonline.mod04.a04;

import java.util.Comparator;

 class Train {
	
	private String station;
	private int num;
	private String time;
	
	public Train (String station, int num, String time) {
		this.station = station;
		this.num = num;
		this.time = time;
	}
	
	public static class NumberComparator implements Comparator<Train> {
		@Override
		public int compare(Train left, Train right) {
			return left.num - right.num;
		}
	}
	
	public static class StationTimeComparator implements Comparator<Train> {
		@Override
		public int compare(Train left, Train rigth) {
			if(left.station == rigth.station)
				return left.time.compareTo(rigth.time);
			return left.station.compareTo(rigth.station);
		}
	}
	
	public void print() {
		
		System.out.printf("%-6s%-10s%-6s",num,station,time);
		System.out.println();
	}

}
