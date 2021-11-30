package com.fdmgroup.app;

import java.util.List;
import com.fdmgroup.module.Book;

public class CheckOut {
	double priceAtCheckout;

	public CheckOut() {
		super();
		priceAtCheckout = 0.0;
	}

	public Double calculatePrice(List<Book> listOfBooks) {
		for (int i = 0; i < listOfBooks.size(); i++) {
			priceAtCheckout = priceAtCheckout + 25.99;
		}

		if (listOfBooks.size() == 0 || listOfBooks.size() == 1 || listOfBooks.size() == 2) {
			return priceAtCheckout;
		}

		else if (listOfBooks.size() == 3) {
			priceAtCheckout = priceAtCheckout - (priceAtCheckout * 0.01);
			return priceAtCheckout;
		} else if (listOfBooks.size() == 7) {
			priceAtCheckout = priceAtCheckout - (priceAtCheckout * 0.02);
			return priceAtCheckout;
		} else if (listOfBooks.size() == 10) {
			priceAtCheckout = priceAtCheckout - (priceAtCheckout * 0.13);
			return priceAtCheckout;
		} else {
			return priceAtCheckout;
		}
	}
}
