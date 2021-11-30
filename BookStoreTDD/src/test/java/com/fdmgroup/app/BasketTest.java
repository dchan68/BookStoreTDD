package com.fdmgroup.app;

import static org.junit.Assert.assertEquals;
import com.fdmgroup.module.*;

import java.util.List;
import org.junit.Before;
import org.junit.Test;

import com.fdmgroup.module.Book;

public class BasketTest {
	Basket basket;
	Book book;
	Book book2;
	
	@Before
	public void init() {
		basket = new Basket();
		book = new Book();
	}
	
	@Before
	public void init2() {
		basket = new Basket();
		book = new Book();
		book2 = new Book();
	}
	
	@Test
	public void test_GetBooksInBasket_ReturnsEmptyBookList_ifNoBooksHaveBeenAdded() {
		List<Book> booksInBasket = basket.getBooksInBasket();
		assertEquals(0, booksInBasket.size());
	}
	
	@Test
	public void test_GetBooksInBasket_ReturnsArrayOfLengthOne_AfterAddBookMethodIsCalledWithOneBook(){
		basket.addBook(book);
		List<Book> booksInBasket = basket.getBooksInBasket();
		assertEquals(1, booksInBasket.size());
	}
	
	@Test
	public void test_GetBooksInBasket_ReturnsArrayOfLengthTwo_AfterAddBookMethodIsCalledWithTwoBook() {
		basket.addBook(book);
		basket.addBook(book2);
		List<Book> booksInBasket = basket.getBooksInBasket();
		assertEquals(2, booksInBasket.size());
	}
}
