package com.epam.jonline.mod04.b03;

import java.util.ArrayList;
import java.util.List;

public class Country {
	private String name;
	private String capital;
	private double square;

	private List<City> cityList = new ArrayList<>();
	private List<District> districtList = new ArrayList<>();
	private List<Region> regionList = new ArrayList<>();

	public Country(String name_, String capital_, double square_) {
		name = name_;
		capital = capital_;
		square = square_;
	}

	public String getName() {
		return name;
	}

	public String getCapital() {
		return capital;
	}

	public double getSquare() {
		return square;
	}

	public List<City> getCityList() {
		return cityList;
	}

	public List<District> getDistrictList() {
		return districtList;
	}

	public List<Region> getRegionList() {
		return regionList;
	}

	public void addCity(City city) {
		cityList.add(city);
	}

	public void addDistrict(District district) {
		districtList.add(district);
	}

	public void addRegion(Region region) {
		regionList.add(region);
	}

	public void sortByName() {
		regionList.sort(new Region.ByNameComparator());
	}
}
