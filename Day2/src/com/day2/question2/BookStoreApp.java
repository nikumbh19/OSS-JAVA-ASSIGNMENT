package com.day2.question2;

import java.util.Scanner;

public class BookStoreApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int choice = 1;
		BookStore bs = new BookStore();
		Scanner scn = new Scanner(System.in);
		while (choice != 0) {
			System.out.println("Please select your preference");
			System.out.println("1.Display book  2.Order Book  3.Sell Book");

			choice = scn.nextInt();
			if (choice == 1) {
				bs.display();
			} else if (choice == 2) {
				System.out.println("Ordering new Book");
				System.out.println("Please tell book title");
				String title = scn.next();
				System.out.println("Please tell Author name");
				String author = scn.next();
				System.out.println("Please tell Book ISBN");
				String isbn = scn.next();

				System.out.println("Please tell number of copies");
				int numCopies = scn.nextInt();

				bs.order(title, author, isbn, numCopies);

			} else if (choice == 3) {
				System.out.println("Selling Book");
				System.out.println("Please tell Book ISBN");
				String isbn = scn.next();

				System.out.println("Please tell number of copies");
				int numCopies = scn.nextInt();

				bs.sell(isbn, numCopies);
			}
		}
		scn.close();
	}
}


