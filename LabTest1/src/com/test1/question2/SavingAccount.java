package com.test1.question2;

public class SavingAccount extends Account {
private static float interestRate=5.0f;
	
	private float interestRate() {
		return interestRate;
	}
	
	public void SavingAccount() {
		System.out.println("Default Constructor of SavingAccount class");
	}
	
	public static float getInterestRate() {
		return interestRate;
	}

	public static void setInterestRate(float interestRate) {
		SavingAccount.interestRate = interestRate;
	}

	public void SavingAccount(SavingAccount savingAccount) {
		//super(savingAccount);
	}
	
	public void input() {
		System.out.println("Enter input for saving account");
	}
	
	
	public void print() {
		System.out.println(this.toString());
	}

	@Override
	public String toString() {
		StringBuilder str=new StringBuilder(super.toString());
		str.append("SavingAccount interestRate rate is: "+interestRate);
		return str.toString();
	}
}