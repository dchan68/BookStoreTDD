package com.fdmgroup.app;
import com.fdmgroup.module.*;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class CheckOutTest {
	Basket basket;
	CheckOut checkout;
	Book book1;
	Book book2;
	Book book3;
	Book book4;
	Book book5;
	Book book6;
	Book book7;
	Book book8;
	Book book9;
	Book book10;
	
	@Before
	public void init() {
		basket = new  Basket();
		checkout = new CheckOut();
		book1 = new Book();
		book2 = new Book();
		book3 = new Book();
		book4 = new Book();
		book5 = new Book();
		book6 = new Book();
		book7 = new Book();
		book8 = new Book();
		book9 = new Book();
		book10 = new Book();
	}
	
	@Test
	public void test_CalculatePrice_ReturnsDoubleZeroPointZeroWhenPassedAnEmptyBasket() {
		Double priceAtCheckout = checkout.calculatePrice(basket.getBooksInBasket());
		assertEquals(0.0, priceAtCheckout, 0.00);
	}
	
	@Test
	public void test_CalculatePrice_ReturnsPriceOfBookInBasket_WhenPassedBasketWithOneBook() {
		basket.addBook(book1);
		Double priceAtCheckout = checkout.calculatePrice(basket.getBooksInBasket());
		assertEquals(25.99, priceAtCheckout, 0.01);
	}

	@Test
	public void test_CalculatePrice_ReturnsPriceOfBooksInBasket_WhenPassedBasketWithTwoBooks() {
		basket.addBook(book1);
		basket.addBook(book2);
		Double priceAtCheckout = checkout.calculatePrice(basket.getBooksInBasket());
		assertEquals(51.98, priceAtCheckout, 0.01);
	}

	@Test
	public void test_CalculatePrice_ReturnsPriceOfBooksInBasketWithDiscount_WhenPassedBasketWithThreeBooks() {
		basket.addBook(book1);
		basket.addBook(book2);
		basket.addBook(book3);
		Double priceAtCheckout = checkout.calculatePrice(basket.getBooksInBasket());
		assertEquals(77.19, priceAtCheckout, 0.01);
	}
	
	@Test
	public void test_CalculatePrice_ReturnsPriceOfBooksInBasketWithDiscount_WhenPassedBasketWithSevenBooks() {
		basket.addBook(book1);
		basket.addBook(book2);
		basket.addBook(book3);
		basket.addBook(book4);
		basket.addBook(book5);
		basket.addBook(book6);
		basket.addBook(book7);
		
		Double priceAtCheckout = checkout.calculatePrice(basket.getBooksInBasket());
		assertEquals(178.29, priceAtCheckout, 0.01);
	}
	
	@Test
	public void test_CalculatePrice_ReturnsPriceOfBooksInBasketWithDiscount_WhenPassedBasketWithTenBooks() {
		basket.addBook(book1);
		basket.addBook(book2);
		basket.addBook(book3);
		basket.addBook(book4);
		basket.addBook(book5);
		basket.addBook(book6);
		basket.addBook(book7);
		basket.addBook(book8);
		basket.addBook(book9);
		basket.addBook(book10);
		
		Double priceAtCheckout = checkout.calculatePrice(basket.getBooksInBasket());
		assertEquals(226.11, priceAtCheckout, 0.01); 
	}
}
