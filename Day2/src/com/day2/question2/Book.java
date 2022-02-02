package com.day2.question2;

public class Book {
		public String author;
		public String isbn;
		public int numOfCopies;
		public String BookTitle;
		public String getAuthor() {
			return author;
		}
		public void setAuthor(String author) {
			this.author = author;
		}
		public String getIsbn() {
			return isbn;
		}
		public void setIsbn(String isbn) {
			this.isbn = isbn;
		}
		public int getNumOfCopies() {
			return numOfCopies;
		}
		public void setNumOfCopies(int numOfCopies) {
			this.numOfCopies = numOfCopies;
		}
		public String getBookTitle() {
			return BookTitle;
		}
		public void setBookTitle(String bookTitle) {
			BookTitle = bookTitle;
		}
		public void display() {
			System.out.println("Book Title:" +BookTitle);
			System.out.println("Author :" +author);
			System.out.println(" ISBN :" +isbn);
			System.out.println(" Number of Copies:" +numOfCopies);
		}
		}

