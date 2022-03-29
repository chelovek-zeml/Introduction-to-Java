package com.epam.jonline.mod04.b03;

import java.util.Comparator;

public class Region {
	private String name;
	private String regional_center;
	
	public Region(String name_, String regional_center_) {
		name = name_;
		regional_center = regional_center_;
	}
	
	public String getName() {
		return name;
	}
	
	public String getRegional_center() {
		return regional_center;
	}
	public static class ByNameComparator implements Comparator<Region> {
		@Override
		public int compare(Region left, Region right) {
				return left.name.compareTo(right.name);
		}
	}

}
