package car;

import static car.CarName.SONATA;

public class Sonata extends Car {
	public Sonata(int distance) {
		super(SONATA.getName(), distance, 10);
	}
}
