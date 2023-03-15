package com.virtusa.TreeSet;

public class Books {

	int bookId;
	String bookName;
	int price;

	public Books() {

	}

	public Books(int bookId, String bookName, int price) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.price = price;
	}

	public int getBookId() {
		return bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public int getPrice() {
		return price;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return " [bookId=" + bookId + ", bookName=" + bookName + ", price=" + price + "]";
	}

}
