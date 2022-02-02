package com.day2.question2;

public class BookStore extends Book {
	public int bookCounter =0;
	Book[] books = new Book[10];
	public void sell(String isbn, int noOfcopies) {
		boolean isfound = false;
		if(bookCounter == 0) {
			System.out.println("There are no books in the store");
		}
		else {
			for(int i =0;i< bookCounter; i++) {
				if(books[i].isbn.equals(isbn)) {
					if(books[i].getNumOfCopies() > 0) {
						System.out.println("Books found");
						books[i].numOfCopies -= numOfCopies;
						isfound = true;
						break;
					}
				}
			}
			if (isfound == false) {
				System.out.println("Sorry, book not found");	
			}
	}
	}
	public void order (String title, String author, String isbn, int NumOfCopies) {
		boolean isavialable = false;
		Book book = new Book();
		book.setBookTitle(title);
		book.setAuthor(author);
		book.setIsbn(isbn);
		book.setNumOfCopies(NumOfCopies);
		
		if(bookCounter ==0) {
			books[0] = book;
			bookCounter++;
			isavialable = true;
		}
		else {
			for(int i =0; i< bookCounter; i++) {
				if(books[i].isbn.contentEquals(isbn)) {
					books[i].numOfCopies +=NumOfCopies;
					isavialable = true;
					break;
				}
			}
		}
		if(isavialable == false && bookCounter < 10) {
		books[bookCounter++] = book;	
		}}
	
public void display() {
	if(bookCounter == 0) {
		System.out.println("there are no books to display");
	}
	else {
		for(int i =0; i< bookCounter; i++) {
			System.out.println("Book title: " +books[i].getBookTitle());
			System.out.println("Book Author: " +books[i].getAuthor());
			System.out.println("Book ISBN: " +books[i].getIsbn());
			System.out.println("Book copies; " +books[i].getNumOfCopies());
		}
	}
}
}
