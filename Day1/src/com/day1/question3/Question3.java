/*Q3. Write a program called GradesAverage, which prompts user for the number of students, reads it
from the keyboard, and saves it in an int variable called numStudents. It then prompts user for the 
grades of each of the students and saves them in an int array called grades. Your program shall 
check that the grade is between 0 and 100. A sample session is as follow:
Enter the number of students: 3
Enter the grade for student 1: 55
Enter the grade for student 2: 108
Invalid grade, try again...
Enter the grade for student 2: 56
Enter the grade for student 3: 57
The average is: 56.0*/


package com.day1.question3;
import java.util.Scanner;
class Question3 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the no of Students");
	int noOfStudents = sc.nextInt();
	
	int grades[] = new int [noOfStudents];
	for(int i =0; i<noOfStudents; i++) {
		System.out.println("Enter the grades" +i);
		int grade = sc.nextInt();
		if(grade<0 || grade >100) {
			System.out.println(" you have entered wrong gardes");
			--i;
		}
		else {
			grades[i]= grade;
		}
	}
	int sum = 0;
	for(int i=0; i<noOfStudents; i++) {
		sum+=grades[i];
	}
	double average=sum/noOfStudents;
	System.out.println("Average is:" + average);
}
}