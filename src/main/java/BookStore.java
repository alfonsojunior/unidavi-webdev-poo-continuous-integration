import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class BookStore {

	private static final double preco = 8.00;
	
	public BookStore() {
		
	}
	
	public double calculateBasketCost(List<Integer> books) {
		
		double retorno = 0.00;
		
		Set<Integer> unique = new HashSet<Integer>(books);
		System.out.println(unique);
		/*
		for (Integer key : unique) {
		    System.out.println(key + ": " + Collections.frequency(books, key));
		}
		*/
		
		return retorno;
		
	}

}
