import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> books = new ArrayList<Integer>();
		books.add(1);
		books.add(2);
		books.add(1);
		books.add(3);
		BookStore store = new BookStore();
		store.calculateBasketCost(books);
	}

}
