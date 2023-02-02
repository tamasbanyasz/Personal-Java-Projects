package MyBooks;

public class Book extends Writer{
	
	private String writerFirstName;
	private String writerLastastName;
	private String bookTitle;
	
	public Book(String writerFirstName, String writerLastastName, String bookTitle) {
		super(writerFirstName, writerLastastName);
		this.bookTitle = bookTitle;
		this.writerFirstName = writerFirstName;
		this.writerLastastName = writerLastastName;
	}


	public String getWriterFirstName() {
		return writerFirstName;
	}


	public void setWriterFirstName(String firstName) {
		this.writerFirstName = firstName;
	}


	public String getWriterLastName() {
		return writerLastastName;
	}


	public void setWriterLastName(String lastName) {
		this.writerLastastName = lastName;
	}


	public String getWriterBookTitle() {
		return bookTitle;
	}


	public void setWriterBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}


	@Override
	public String toString() {
		return "Book [firstName=" + writerFirstName + ", lastName=" + writerLastastName + ", bookTitle=" + bookTitle + "]";
	}
}
