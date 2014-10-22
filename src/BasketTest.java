import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class BasketTest {

	Espresso houseRoast;

	@Before
	public void setup() {
		houseRoast = new HouseRoast();
	}
	
	@Test
	public void test() {
		assertEquals(houseRoast.getName(), "House Roast");
	}

}
