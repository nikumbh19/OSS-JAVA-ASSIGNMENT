package com.day8.session1.collection;

import java.util.Comparator;

public class StudentSorterAsPerMarks implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		return Integer.compare(o2.getMarks(), o1.getMarks());
	}

}
