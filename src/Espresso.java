
public abstract class Espresso implements Purchasable {
	private final float arabicaContent;
	
	public float getArabicaContent() { return arabicaContent; }
	
	protected Espresso (float arabicaContent) {
		this.arabicaContent = arabicaContent;
	}
}
