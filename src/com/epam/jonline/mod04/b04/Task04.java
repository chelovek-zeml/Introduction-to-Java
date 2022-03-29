package com.epam.jonline.mod04.b04;

public class Task04 {
	public static void main(String[] args) {
		System.out.println("4. Счета. Клиент может иметь несколько счетов в банке. Учитывать возможность блокировки/разблокировки \r\n"
				+ "счета. Реализовать поиск и сортировку счетов. Вычисление общей суммы по счетам. Вычисление суммы по \r\n"
				+ "всем счетам, имеющим положительный и отрицательный балансы отдельно.");
		System.out.println();
		
		Client client = new Client("Макс С.А.", 
				new Account( Account.AccountType.STAND, 234.45),
                new Account(Account.AccountType.SAVE, 1000),
                new Account(Account.AccountType.INCOME, - 480.2));
		
		
		client.PosAmount();
		client.NegAmount();
		client.TotalAmount();
		client.searchAccount(Account.AccountType.INCOME);
		client.blokAccount(Account.AccountType.INCOME, false);
		client.sortAccount();
	}
}
