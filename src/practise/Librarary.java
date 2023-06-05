package practise;

import java.util.ArrayList;
import java.util.List;

public class Librarary {

	String name;
	private final List<Book> books;

	
	public Librarary(String name, List<Book> books) {
		super();
		this.name = name;
		this.books = books;
	}

	@Override
	public String toString() {
		return "Librarary [name=" + name + ", books=" + books + "]";
	}
	
	public List<Book> getBooks() {
		return books;
	}
	

}
