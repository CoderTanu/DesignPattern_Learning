package Iterator_Design_pattern;

import java.util.Iterator;
import java.util.List;

public class Library {
	
private List<Book> booksList;
	
	
	public Library(List<Book> booksList) {
		this.booksList=booksList;
	}

	
	public BookIterator createIterator() {
		return new BookIterator(booksList);
	}
	
	
	
}
