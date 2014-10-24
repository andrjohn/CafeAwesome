
public class Americano extends CoffeeOption {
	private static final int ADDED_COST = 40;
	
	protected Americano(Espresso base) {
		super(base);
	}

	@Override
	public String getName() {
		return baseCoffee.getName() + " Americano";
	}

	@Override
	public int getPrice() {
		return baseCoffee.getPrice() + ADDED_COST;
	}
}
