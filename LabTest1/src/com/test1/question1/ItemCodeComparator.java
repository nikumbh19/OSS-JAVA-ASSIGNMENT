package com.test1.question1;

import java.util.Comparator;

public class ItemCodeComparator implements Comparator<Merchandise>{

	@Override
	public int compare(Merchandise m1, Merchandise m2) {
		return m1.getItemCode().compareTo(m2.getItemCode());
		
	}

}
