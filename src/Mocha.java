
public class Mocha extends CoffeeOption {

	private static final int ADDED_COST = 80;
	
	protected Mocha(Espresso base) {
		super(base);
	}

	@Override
	public String getName() {
		return baseCoffee.getName() + " Mocha";
	}

	@Override
	public int getPrice() {
		return baseCoffee.getPrice() + ADDED_COST;
	}

}
