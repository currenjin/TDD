package car;

public class Avante extends Car {
	public Avante(int distance) {
		super(CarName.AVANTE.getName(), distance, KmPerLiter.AVANTE.getKmPerLiter());
	}
}
