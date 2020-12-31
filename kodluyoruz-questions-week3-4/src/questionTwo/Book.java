package questionTwo;

public class Book implements Comparable<Book> {


	private String bookName;
	private int pageCount;
	private String Author;
	private String publicationYear;
	

	public Book(String bookName, int pageCount, String author, String publicationYear) { 
		this.bookName = bookName;
		this.pageCount = pageCount;
		this.Author = author;
		this.publicationYear = publicationYear;
	}
	 


	/**
	 * @return the bookName
	 */
	public String getBookName() {
		return bookName;
	}



	/**
	 * @param bookName the bookName to set
	 */
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}



	/**
	 * @return the pageCount
	 */
	public int getPageCount() {
		return pageCount;
	}



	/**
	 * @param pageCount the pageCount to set
	 */
	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}



	/**
	 * @return the author
	 */
	public String getAuthor() {
		return Author;
	}



	/**
	 * @param author the author to set
	 */
	public void setAuthor(String author) {
		Author = author;
	}



	/**
	 * @return the publicationYear
	 */
	public String getPublicationYear() {
		return publicationYear;
	}



	/**
	 * @param publicationYear the publicationYear to set
	 */
	public void setPublicationYear(String publicationYear) {
		this.publicationYear = publicationYear;
	}



	@Override
	public int compareTo(Book o) {
		 
		return this.getBookName().compareTo(o.getBookName());
	}

}
