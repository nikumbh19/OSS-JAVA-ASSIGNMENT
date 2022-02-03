package com.day2.question3;

import java.util.Scanner;
public class BankApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Welcome to HDFC Bank. Let's Create your Account first");
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter your name");
		String name=scn.nextLine();
		
		//memberName=name;
		Account acc=new Account(name);
		SavingsAccount sa = new SavingsAccount();
		CurrentAccount ca = new CurrentAccount();
		
		System.out.println("What type of Account do you want to open? 1. Savings  2.Current");
		int accountChoice=scn.nextInt();
		String accountType;
		if(accountChoice==1) {
			accountType="Savings";
		}
		else {
			accountType="Current";
		}
		
		System.out.println("Account created Successfully with following Dertails");
		System.out.println("Holder Name: "+ name +"\n" + "Account Type: "+accountChoice+"\n" + "Account Number: "+acc.accountNumber +"\n"+"Current Balance: "+acc.accountBalance);
		
		int choice=1;
		while(choice!=0) {
			
		System.out.println("Select operation that you want to perform");
		System.out.println("1. Deposit Money  2. Withdraw Money 3. Display Balance 0.exit");
		choice=scn.nextInt();
		
		
			if(choice==1) {
				System.out.println("Enter the amount that you want to deposit ");
				double amount=scn.nextDouble();
				sa.deposit(amount);
			}
			else if(choice==2) {
				System.out.println("Enter the amount that you want to withdraw");
				double amount=scn.nextInt();
				sa.withdraw(amount);
			}
			else if(choice==3) {
				sa.getBalance();
			}
			else if(choice<0 && choice>3) {
				System.out.println("You have entered wrong choice,try again");
			}
		}

	}

}