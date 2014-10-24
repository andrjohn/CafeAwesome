import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;


public class Basket {

	Collection<Purchasable> contents = new ArrayList<Purchasable>();
	
	/**
	 * Don't worry about this for now
	 */
	private static final long serialVersionUID = 1L;

	public void add(Purchasable item) {
		contents.add(item);
	}
	
	public void printReceipt() {
		/*
		 *  @todo Complete this using System.out.println to produce
		 *  something like:
		 *  
		 *  House Roast    x 2    3.00
		 *  Midnight Blend        1.80
		 *  ==========================
		 *  Total                 4.80
		 */
		int total = printAllItems();
		printTotal(total);
	}

	private void printTotal(int total) {
		System.out.println("====================================================");
		System.out.printf("Total%40s %3d.%02d\n", "", total / 100, total % 100);
	}

	private int printAllItems() {
		
		Map<Purchasable, Integer> itemCount = new HashMap<Purchasable, Integer>();

		for (Purchasable item: contents) {
			if (!itemCount.containsKey(item)) {
				itemCount.put(item, Collections.frequency(contents, item));
			}
		}

		int total = 0;
		for (Purchasable item: itemCount.keySet()) {
			int count = itemCount.get(item);
			printItem(item, count);			
			total += item.getPrice();
		}
		return total;
	}

	private void printItem(Purchasable item, int count) {
		String name = item.getName();
		int price   = count * item.getPrice();

		if (name.length() > 40) {
			name = name.substring(0, 39);
		}
		
		if (count == 1) {
			System.out.printf("%-40s      %3d.%02d\n", name, price / 100, price % 100);
		} else {
			System.out.printf("%-40s x %2d %3d.%02d\n", name, count, price / 100, price % 100);			
		}
	}
}
