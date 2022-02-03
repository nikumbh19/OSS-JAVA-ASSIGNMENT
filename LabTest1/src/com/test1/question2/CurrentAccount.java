package com.test1.question2;
public class CurrentAccount extends Account {

private float minimumBalance=5000;
	
	public CurrentAccount() {
		super();
		
	}
	
	public CurrentAccount(CurrentAccount account) {
		super(account);
		
	}
	

	
	

	
	public float getMinimumBalance() {
		return minimumBalance;
	}

	public void setMinimumBalance(float minimumBalance) {
		this.minimumBalance = minimumBalance;
	}

	@Override
	public String toString() {
		StringBuilder str=new StringBuilder(super.toString());
		str.append("CurrentAccount : minimumBalance must be: "+minimumBalance);
		return str.toString();
	}
	
	public float getCharges() {
		return 100.00f;  //any charges
	}
	
}
