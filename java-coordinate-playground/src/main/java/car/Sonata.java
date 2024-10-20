package car;

public class Sonata extends Car {
	public Sonata(int distance) {
		super(CarName.SONATA.getName(), distance, KmPerLiter.SONATA.getKmPerLiter());
	}
}
