package com.epam.jonline.mod04.b04;

public class Account {
	protected enum AccountType {
		STAND, SAVE, INCOME;
	}

	private double balance = 0;
	private boolean blok = true;
	private AccountType acType;

	public Account(AccountType acType, double balance) {
		
		this.acType = acType;
		this.balance = balance;
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void setBlok(boolean blok) {
		this.blok = blok;
	}
	
	public boolean getBlok() {
		return blok;
	}
	
	public AccountType getAcType() {
		return acType;
	}
	
	public String toString() {
		String st = "";
		String b;
		
		if(blok) {
			b = "Разблокирован. ";
		}else {
			b = "Заблокирован. ";
		}
		st = "Счет: " + acType + " Баланс: " + balance + " " + b;
		return st;
	}
}
