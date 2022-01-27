/*Q1. Write a program called Fibonacci to display the first 20 Fibonacci numbers F(n), where 
F(n)=F(n–1)+F(n–2) and F(1)=F(2)=1. Also compute their average. The output shall look like:
The first 20 Fibonacci numbers are:
1 1 2 3 5 8 13 21 34 55 89 144 233 377 610 987 1597 2584 4181 6765
The average is 885.5*/

package com.day1.question1;
import java.util.*;
public class Question1 {
	public static void main (String[] agrs) {
	int a=0;
	int b=1;

	for (int i =1; i<=20; i++) {
		int c = a+b;
		 a =b;
		 b= c;
		System.out.println("the first 20 Fibonnaci numbers are "+ c);
	}

	
}
}
