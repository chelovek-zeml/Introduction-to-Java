package com.epam.jonline.mod04.b05;

public class Tour {
	
	private String nameTour;
	private String tourType;
	private int food;
	private int transportType;
	private int days;
	private double price;

	public Tour(String nameTour_, String tourType_, int days_, double price_, int transportType_, int food_) {
		nameTour = nameTour_;
		tourType = tourType_;
		days = days_;
		price = price_;
		transportType = transportType_;
		food = food_;
	}
	public void setNameTour(String nameTour_) {
		nameTour = nameTour_;
	}
	public String getNameTour() {
		return nameTour;
	}
	public void setTourType(String tourType_) {
		tourType = tourType_;
	}
	public String getTourType() {
		return tourType;
	}
	public void setDays(int days_) {
		days = days_;
	}
	public int getDays() {
		return days;
	}
	public void setPrice(double price_) {
		price = price_;
	}
	public double getPrice() {
		return price;
	}
	public void setTransportType(int transportType_) {
		transportType = transportType_;
	}
	public int getTransportType() {
		return transportType;
	}
	public void setFood(int food_) {
		food = food_;
	}
	public int getFood() {
		return food;
	}

	 public void print() {

	        System.out.print("Название тура: (" + nameTour + ")  Тип тура: (" + tourType + ")  Количество дней: (" + days +
	                ")  Цена: (" + price);
	        System.out.print(") Вид транспорта: (");
	        if (transportType == 1)
	            System.out.print("PLANE)");
	        if (transportType == 2)
	            System.out.print("BUS)");
	        if (transportType == 3)
	            System.out.print("TRAIN)");
	        if (transportType == 4)
	            System.out.print("SHIP)");
	        if (transportType == 5)
	            System.out.print("CAR)");

	        System.out.print(" Питание: (");
	        if (food == 1)
	            System.out.print("BREAKFAST)");
	        if (food == 2)
	            System.out.print("BREAKFAST_DINNER)");
	        if (food == 3)
	            System.out.print("ALL_INCLUSIVE)");
	        if (food == 4)
	            System.out.print("NOT_FOOD)");
	        System.out.println();
	    }





}
