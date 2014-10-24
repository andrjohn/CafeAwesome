import static org.junit.Assert.*;

import org.junit.Test;


public class BasketTest {

	Espresso houseRoast  = HouseRoast.get();
	Espresso darkItalian = new DarkItalian();

	@Test
	public void receiptTest() {
		Basket basket = new Basket();
		
		basket.add(HouseRoast.get());
		basket.add(darkItalian);
		basket.add(new Mocha(HouseRoast.get()));
		basket.add(HouseRoast.get());
		basket.add(new Americano(darkItalian));

		
		basket.printReceipt();
	}

}
