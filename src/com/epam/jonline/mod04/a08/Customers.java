package com.epam.jonline.mod04.a08;

import java.util.*;

public class Customers {

	private int size;
	private int capacity;
	private Customer[] customers;

	public Customers(int capacity_) {
		size = 0;
		capacity = capacity_;
		customers = new Customer[capacity];
	}

	public Customers() {
		this(10);
	}

	public void pushBack(Customer customer) {
		if (size < capacity) {
			customers[size] = customer;
			size++;
		} else {
			Customer[] buffer = new Customer[capacity * 2];
			for (int i = 0; i < size; i++) {
				buffer[i] = customers[i];
		}
		customers = buffer;
		capacity = capacity * 2;
		customers[size] = customer;
		size++;
		}
	}
	
	public void printer() {
		for(int i = 0; i < size; ++i) 
			customers[i].print();
	}
	
	public void sortByName() {
		Arrays.sort(customers, 0, size, new Customer.ByNameComparator());
	}
	
	public void printCard(String a, String b) {
		for(int i = 0; i < size; ++i) {
			if (customers[i].getNumCard().compareTo(a) >= 0 && customers[i].getNumCard().compareTo(b) <= 0)
				customers[i].print();
		}
			
		
	}
}
