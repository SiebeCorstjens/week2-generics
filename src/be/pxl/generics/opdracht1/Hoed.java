package be.pxl.generics.opdracht1;

public class Hoed<T extends Dier> {
	private T dier;
	private boolean hasLooked;
	
	public Hoed(T dier) {
		this.dier = dier;
	}
	
	public T kijk() {
		if (!hasLooked) {
			hasLooked = true;
			
			return null;
		}
		
		return dier;
	}
}
