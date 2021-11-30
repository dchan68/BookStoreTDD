package com.fdmgroup.module;

public class Book {
	private int id;
	private String name;

	public int getBookId() {
		return id;
	}

	public void setBookId(int age) {
		this.id = age;
	}

	public String getBookName() {
		return name;
	}

	public void setBookName(String name) {
		this.name = name;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (!(o instanceof Book))
			return false;

		Book book = (Book) o;

		if (id != book.id)
			return false;
		if (name != null ? !name.equals(book.name) : book.name != null)
			return false;

		return true;
	}

	@Override
	public int hashCode() {
		int result = id;
		result = 31 * result + (name != null ? name.hashCode() : 0);
		return result;
	}

	@Override
	public String toString() {
		return String.format("BookID:%d, BookName:%s", id, name);
	}
}
