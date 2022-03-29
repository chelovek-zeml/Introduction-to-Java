package com.epam.jonline.mod04.a10;

import java.util.Scanner;

public class Airline {

	private String destination, time, num, type, day;
	private int id;
	private static int ID;

	public Airline(String destination_, String time_, String num_, String type_, String day_) {
		destination = destination_;
		time = time_;
		num = num_;
		type = type_;
		day = day_;
		id = ID++;
	}

	public int getId() {
		return id;
	}

	public String getDestination() {
		return destination;
	}

	public String getTime() {
		return time;
	}

	public String getNum() {
		return time;
	}

	public String getType() {
		return type;
	}

	public String getDay() {
		return day;
	}

	public void setDestination(String destination_) {
		destination = destination_;
	}

	public void setTime(String time_) {
		time = time_;
	}

	public void setNum(String num_) {
		num = num_;
	}

	public void setType(String type_) {
		type = type_;
	}

	public void setDay(String day_) {
		day = day_;
	}

	public String toString() {

		return id + "\n  Номер рейса: " + num + "\n Пункт назначения: " + destination + "\n Время вылета: " + time
				+ "\n День недели: " + day + "\n Тип самолета: " + type;
	}

	public void print() {
		System.out.println(toString());
	}

	public static String read(Scanner scan) {
		String st = "";

		while (st.length() == 0) {
			st = scan.nextLine();
		}
		return st;
	}

	public static Airline getAirline(Scanner sc) {
		Airline airline = new Airline("", "", "", "", "");
		System.out.println("Пункт назначения:");
		airline.destination = read(sc);
		System.out.println("Время вылета:");
		airline.time = read(sc);
		System.out.println("Номер рейса:");
		airline.num = read(sc);
		System.out.println("Тип самолета:");
		airline.type = read(sc);
		System.out.println("День недели:");
		airline.day = read(sc);
		return airline;
	}
	
}









