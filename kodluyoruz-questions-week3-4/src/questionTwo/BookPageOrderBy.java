package questionTwo;

import java.util.Comparator;

public class BookPageOrderBy implements Comparator<Book> {

	@Override
	public int compare(Book o1, Book o2) {

		int bookOnePageCount = o1.getPageCount();
		int bookTwoPageCount = o2.getPageCount();
		if (bookTwoPageCount > bookOnePageCount) {
			return -1;
		} else if (bookOnePageCount > bookTwoPageCount)
			return 1;
		else
			return 0;
	}

}
