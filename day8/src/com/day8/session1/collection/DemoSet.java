package com.day8.session1.collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import javax.swing.border.EmptyBorder;

public class DemoSet {
	
	public static void main(String[] args) {
		//Set<Student> students=new TreeSet<Student>(new StudentSorterAsPerMarks());
		Set<Student> students=new TreeSet<Student>(new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				return Integer.compare(o2.getMarks(), o1.getMarks());
			}
		});
		
		students.add(new Student(12, "raj", 67));
		students.add(new Student(102, "ekta", 89));
		students.add(new Student(52, "vineet", 97));
		
//		boolean isThere= students.contains(new Student(12, "raj", 67));
//		System.out.println(isThere);
		
		for(Student student: students) {
			System.out.println(student);
		}
		
	}

}
