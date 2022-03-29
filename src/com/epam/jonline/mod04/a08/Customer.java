package com.epam.jonline.mod04.a08;

import java.util.Scanner;
import java.util.*;

public class Customer {

	private int id;
	private static int ID;
	private String name, surname, lastname, adress, numCard, numBank;

	public Customer(String name_, String surname_, String lastname_, String adress_, String numCard_, String numBank_) {
		name = name_;
		surname = surname_;
		lastname = lastname_;
		adress = adress_;
		numCard = numCard_;
		numBank = numBank_;
		id = ID++;
	}

	public void setName(String name_) {
		name = name_;
	}

	public void setSunrame(String surname_) {
		surname = surname_;
	}

	public void setLastname(String lastname_) {
		lastname = lastname_;
	}

	public void setAdress(String adress_) {
		adress = adress_;
	}

	public void setNumCard(String numCard_) {
		numCard = numCard_;
	}

	public void setNumBank(String numBank_) {
		numBank = numBank_;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getSurnam() {
		return surname;
	}

	public String getLastname() {
		return lastname;
	}

	public String getAdress() {
		return adress;
	}

	public String getNumCard() {
		return numCard;
	}

	public String getNumBank() {
		return numBank;
	}

	public String toString() {
		String st = "";
		st = st + id + ". ФИО:  " + name + " " + surname + " " + lastname + ".\n" + "   АДРЕС:  " + adress + "\n"
				+ "   № Кредитной карты:  " + numCard + "\n" + "   № Банковского счета:  " + numBank;
		return st;
	}

	public void print() {
		System.out.println(toString());
	}

	public static Customer getCustomer(Scanner sc) {

		Customer customer = new Customer("", "", "", "", "", "");

		System.out.print("name: ");
		customer.name = readLine(sc);

		System.out.print("surname: ");
		customer.surname = readLine(sc);

		System.out.print("lastname: ");
		customer.lastname = readLine(sc);

		System.out.print("adress: ");
		customer.adress = readLine(sc);

		System.out.print("numCard: ");
		customer.numCard = readLine(sc);

		System.out.print("numBank: ");
		customer.numBank = readLine(sc);

		return customer;
	}

	public static String readLine(Scanner scan) {
		String st = "";
		while (st.length() == 0) {
			st = scan.nextLine();
		}
		return st;
	}

	public static class ByNameComparator implements Comparator<Customer> {
		@Override
		public int compare(Customer left, Customer right) {
			if (left.surname != right.surname)
				return left.surname.compareTo(right.surname);
			if (left.name != right.name)
				return left.name.compareTo(right.name);
			return left.lastname.compareTo(right.lastname);
		}
	}

}
