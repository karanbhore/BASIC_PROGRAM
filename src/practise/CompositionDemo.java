package practise;

import java.util.ArrayList;
import java.util.List;

public class CompositionDemo {

	public static void main(String[] args) {
		Book b1 = new Book("ABC", "XYZ");
		Book b2 = new Book("EFG", "KLM");
		Book b3 = new Book("222", "YYY");
		Book b4 = new Book("2225", "444");
		Book b5 = new Book("888", "777");
		List<Book> books = new ArrayList<>();
		books.add(b5);
		books.add(b4);
		books.add(b3);
		books.add(b2);
		books.add(b1);

		Librarary librararyy = new Librarary("Fule", books);
		System.out.println(librararyy.getBooks());

		List<Book> bks = librararyy.getBooks();
		int bookCount = 0;
		for (Book bk : bks) {
			bookCount++;
			System.out.println(bk);
		}
		System.out.println(bookCount);

	}
}
