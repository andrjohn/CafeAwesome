
public class HouseRoast extends Espresso {

	// Class stuff
	private static HouseRoast singleton = new HouseRoast();

	public static HouseRoast get() { return singleton; }


	// Instance stuff
	private HouseRoast() {
		super(0.20f);
	}

	@Override
	public String getName() {
		return "House Roast";
	}

	@Override
	public int getPrice() {
		return 150;
	}
}
