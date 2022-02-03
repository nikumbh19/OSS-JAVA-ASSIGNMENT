package com.test1.question1;

import java.io.*;
import java.util.*;

public class MerchandiseMain {
	public static void main(String[] args) {
		String itemCode;
		int quantity;
		double unitPrice;
		List<Merchandise> merchandiseList = new ArrayList<>();

		String line = null;
		try (BufferedReader br = new BufferedReader(new FileReader(
				new File("input.dat")))) {
			while ((line = br.readLine()) != null) {
				
				String[] tokens = line.split(" ");
				itemCode = tokens[0];
				quantity = Integer.parseInt(tokens[1]);
				unitPrice = Double.parseDouble(tokens[2]);
				merchandiseList.add(new Merchandise(itemCode, quantity, unitPrice));
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		
		//merchandiseList.forEach((M) -> System.out.println(M));
		
		for(Merchandise m: merchandiseList) {
			System.out.println(m);
		}
		
		System.out.println("******Sorted in ascending order by name********");
		Collections.sort(merchandiseList,new ItemCodeComparator());
		for(Merchandise m: merchandiseList) {
			System.out.println(m);
		}
		
		System.out.println("******Sorted in descending order by price*******");
			Collections.sort(merchandiseList,new PriceComparator());
			for(Merchandise m: merchandiseList) {
				System.out.println(m);
			}
	}

}