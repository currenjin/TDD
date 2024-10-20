package car;

import static car.CarName.AVANTE;

public class Avante extends Car {
	public Avante(int distance) {
		super(AVANTE.getName(), distance, 15);
	}
}
