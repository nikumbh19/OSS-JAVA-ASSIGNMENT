package com.test1.question2;

public class Account {

	private Owner owner;
	private float balance;
	private String number;

	public Account() {
	
	}

	public Account(Owner owner, String number, float balance) {
		this.owner = owner;
		this.number = number;
		this.balance = balance;
	}

	
	public Account(Account account) {
		this.owner = account.owner;
		this.balance = account.balance;
		this.number = account.number;
	}

//	public void input() {
//		System.out.println("Enter input for Account");
//	}

	public void print() {
		System.out.println(toString());
	}
	
	@Override   					//overriding the toString method
	public String toString() {
		return "Account [owner=" + owner + ", balance=" + balance + ", number=" + number + "]";
	}

	public void deposit(float amount) {
		this.balance += amount;
	}

	public Owner getOwner() {
		return owner;
	}

	public void setOwner(Owner owner) {
		this.owner = owner;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public void setBalance(float balance) {
		this.balance = balance;
	}

	public void withdraw(float amount) {
		if (balance >= amount) {
			balance = balance - amount;
		} else {
			System.out.println("You do not have Sufficient Balance in Your Account");
		}
	}
	
	public float getBalance() {
		return balance;
	}
	
}