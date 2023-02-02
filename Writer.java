package MyBooks;

public class Writer {
	
	private String writerFirstName;
	private String writerLastastName;
	
	
	public Writer(String writerFirstName, String writerLastastName) {
		this.writerFirstName = writerFirstName;
		this.writerLastastName = writerLastastName;
	}

	
	public String getWriterFirstName() {
		return writerFirstName;
	}


	public void setWriterFirstName(String writerFirstName) {
		this.writerFirstName = writerFirstName;
	}


	public String getWriterLastastName() {
		return writerLastastName;
	}


	public void setWriterLastastName(String writerLastastName) {
		this.writerLastastName = writerLastastName;
	}

	@Override
	public String toString() {
		return "Writer [writerFirstName=" + writerFirstName + ", writerLastastName=" + writerLastastName + "]";
	}
}
