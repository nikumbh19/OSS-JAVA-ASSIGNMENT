package com.test1.question1;

import java.util.Comparator;

//Sorting the merchandise in decreasing order by price

public class PriceComparator implements Comparator<Merchandise>{

	@Override
	public int compare(Merchandise m1, Merchandise m2) {
		if(m1.getUnitPrice()==m2.getUnitPrice()) return 0;
		else if(m1.getUnitPrice()<m2.getUnitPrice()) return 1;
		else return -1;
	}

}