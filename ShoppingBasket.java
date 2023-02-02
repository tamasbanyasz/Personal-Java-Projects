package MyBooks;

public class ShoppingBasket<T extends Book> {
	
	private T object;
	private String name;
	
	
	public ShoppingBasket(String name) {
		this.name = name;
	}
	
	public void put(T object) {
		if (isEmpty()) {
			this.object = object;
			System.out.println(object+"' is in shopping basket.");
		} else {
			System.out.println("Shopping basket is full.");
		}
	}
	
	public T getItem() {
		if (isEmpty()) {
			System.out.println("Shopping basket is empty.");
			return null;
		} else {
			T temp = object;
			object = null;
			return temp;
		}
	}
	
	public boolean isEmpty() {
		return object == null;
	}
	
	public boolean notEmpty() {
		return !isEmpty();
	}
	
	

}
