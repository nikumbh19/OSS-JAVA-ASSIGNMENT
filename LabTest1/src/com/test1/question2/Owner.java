package com.test1.question2;

public class Owner {

	private String name;
	private Date dateOfBirth;
	private String nic;
	
	public Owner() {
		//Default Constructor
	}
	
	public Owner(String name,String nic,Date dateOfBirth) {
		this.name=name;
		this.nic=nic;
		this.dateOfBirth=dateOfBirth;
	}

	
	
	public void input() {
		System.out.println("Enter input for owner: ");
	}
	
	public void print() {
		System.out.println(this);
	}

	@Override
	public String toString() {
		return "Owner [name=" + name + ", dateOfBirth=" + dateOfBirth + ", Aadhar=" + nic + "]";
	}
	
	
}
