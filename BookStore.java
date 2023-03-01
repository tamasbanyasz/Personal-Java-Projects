package MyBooks;

public class BookStore {

	public static void main(String[] args) {
		HorrorBook horrorBook = new HorrorBook("King", "Stephen", "IT");
		NiceLiteratureBook niceLiteratureBook = new NiceLiteratureBook("Rooney", "Sally", "Beautiful World, where are you");
		
		System.out.println(horrorBook);
		System.out.println(niceLiteratureBook);
		
		ShoppingBasket<HorrorBook> myHorrorBooks = new ShoppingBasket<>("Own horror books");
		myHorrorBooks.put(horrorBook);
		
		ShoppingBasket<NiceLiteratureBook> myNiceLiteratureBook = new ShoppingBasket<>("Own nice literature books");
		myNiceLiteratureBook.put(niceLiteratureBook);
		
		cashier(myHorrorBooks);
		cashier(myNiceLiteratureBook);

	}
	
	static void cashier(ShoppingBasket<? extends Book> book) {
		System.out.println("Book is at the cashier: " + book.getItem());
	}
}
