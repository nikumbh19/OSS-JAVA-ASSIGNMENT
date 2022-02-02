package com.day2.question1;

class Circle{
	private double radius;
	private String color;

public Circle(){
	radius=1;
	color= "Red";
}
public Circle(double r) {
	radius = r;
	
}
 public double getRadius() {
	return radius; 
 }
 public double getArea() {
	 return 3.14*radius*radius;
 }
}
 
public class Question1 {
public static void main(String[] agrs) {
	Circle circle = new Circle(2.0);
	
	System.out.println("Radius pf Circle:" +circle.getRadius());
	System.out.println("Area of Circle:" +circle.getArea());

	
}
}

