package com.day8.session1.threads;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;

class EmployeeSortingAsPerCity implements Comparator<Employee> {
	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.getCity().compareTo(o2.getCity());
	}
}

class EmployeeSortingAsPerName implements Comparator<Employee> {
	@Override
	public int compare(Employee o1, Employee o2) {
		int val = o1.getName().compareTo(o2.getName());
		if (val == 0) {
			val = Double.compare(o2.getSalary(), o1.getSalary());
		}
		return val;
	}
}

class Employee implements Comparable<Employee> {
	private int id;
	private String name;
	private String city;
	private double salary;

	public Employee(int id, String name, String city, double salary) {
		this.id = id;
		this.name = name;
		this.city = city;
		this.salary = salary;
	}

	public Employee() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Employee [id=").append(id).append(", name=").append(name).append(", city=").append(city)
				.append(", salary=").append(salary).append("]");
		return builder.toString();
	}

	@Override
	public int compareTo(Employee o) {
		return Integer.compare(this.getId(), o.getId());
	}

}

class EmployeeApp {
	private java.util.List<Employee> employees = new ArrayList<Employee>();

	public EmployeeApp() {
		init();
	}

	public void printAllSortedAsPerId() {

	}

	public void printAll() {
		Iterator<Employee> it = employees.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

	private void init() {
		Employee emp = null;
		// to read the file make token of each line and put the records in the arraylist
		try {
			BufferedReader br = new BufferedReader(new FileReader("employee.txt"));
			String line = null;
			while ((line = br.readLine()) != null) {
				String[] tokens = line.split(":");
				emp = new Employee(Integer.parseInt(tokens[0]), tokens[1], tokens[2], Double.parseDouble(tokens[3]));
				employees.add(emp);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}
}

public class DemoThread2 {
	public static void main(String[] args) {
		EmployeeApp app = new EmployeeApp();
		app.printAll();
	}
}
