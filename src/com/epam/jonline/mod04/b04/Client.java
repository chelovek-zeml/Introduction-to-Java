package com.epam.jonline.mod04.b04;

import java.util.*;

public class Client {

	private String nameClient;
	private List<Account> accounts = new ArrayList<>();

	public Client(String nameClient, Account... account) {
		this.nameClient = nameClient;
		this.accounts.addAll(Arrays.asList(account));
	}

	public String getNameClient() {
		return nameClient;
	}

	public void PosAmount() {
		double posBalance = 0;
		for (Account pb : accounts) {
			if (pb.getBalance() > 0) {
				posBalance += pb.getBalance();
			}
		}
		System.out.println("Общая сумма счетов с положительным балансом: " + posBalance);
	}

	public void NegAmount() {
		double negBalance = 0;
		for (Account nb : accounts) {
			if (nb.getBalance() < 0) {
				negBalance += nb.getBalance();
			}
		}
		System.out.println("Общая сумма счетов с отрицательным балансом: " + negBalance);
	}

	public void TotalAmount() {
		double totalBalance = 0;
		for (Account tb : accounts) {
			totalBalance += tb.getBalance();
		}
		System.out.println("Общая сумма счетов: " + totalBalance);
	}

	public void blokAccount(Account.AccountType acType, boolean blok) {
		for (Account ba : accounts) {
			if (ba.getAcType().equals(acType)) {
				ba.setBlok(blok);
				if (blok) {
					System.out.println("Счет: " + acType + " разаблокирован.");
				} else {
					System.out.println("Счет: " + acType + " заблокирован.");
				}
			}
		}
	}

	public void searchAccount(Account.AccountType acType) {
		String a;
		for (Account sa : accounts) {
			if (sa.getAcType().equals(acType)) {
				if (sa.getBlok()) {
					a = "Разблокирован.";
				} else {
					a = "Заблокирован.";
				}
				System.out.println("Счет: " + sa.getAcType() + " Баланс: " + sa.getBalance() + " " + a);
			}
		}

	}

	public class BalanceComparator implements Comparator<Account> {
		@Override
		public int compare(Account a, Account b) {
			return (int) (a.getBalance() - b.getBalance());
		}
	}

	public void sortAccount() {
		Comparator<Account> balanceComparator = new BalanceComparator();
		Collections.sort(accounts, balanceComparator);
		System.out.println();
		for (int i = 0; i < accounts.size(); i++)
			System.out.println(accounts.get(i).toString());
	}

}
