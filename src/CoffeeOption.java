
public abstract class CoffeeOption extends Espresso {

	protected final Espresso baseCoffee;
	
	protected CoffeeOption(Espresso base) {
		super(base.getArabicaContent());
		baseCoffee = base;
	}
}
