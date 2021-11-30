package com.fdmgroup.app;

import com.fdmgroup.module.*;
import java.util.ArrayList;
import java.util.List;

public class Basket {
	List<Book> booksInBasket;
	
	public Basket() {
		super();
		booksInBasket = new ArrayList<Book>();
	}
	
	public List<Book> getBooksInBasket(){
		return booksInBasket;
	}

	public void addBook(Book book) {	
		booksInBasket.add(book);
	}
}
