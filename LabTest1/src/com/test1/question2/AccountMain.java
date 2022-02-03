package com.test1.question2;

public class AccountMain {
	public static void main(String[] args) {
		
		Account ac=new CurrentAccount();
		
		Account ac1=new SavingAccount();
		
		
		Date date = new Date(8,06,1998);
		Owner owner=new Owner("Tanmay Malhotra", "86618st", date);
		
		System.out.println(owner);
		
		
		//create a savings account
		SavingAccount account = new SavingAccount();
		account.setBalance(10000);
		account.setNumber("8750490036");
		account.setOwner(owner);
		account.setInterestRate(7);
		account.print();
		account.deposit(500);
		account.withdraw(800.50f);
		
		//Create a default Account
		CurrentAccount account2 = new CurrentAccount();
		account2.setBalance(50000);
		account2.setOwner(owner);
		account2.setNumber("7678614058");
		account2.setMinimumBalance(10000);
		account2.print();
		
		account2.withdraw(45000);
		account2.withdraw(40000);
		account2.deposit(15000);
		
		account2.print();
	}
}