package car.model;

import car.Car;
import car.CarName;
import car.KmPerLiter;

public class Avante extends Car {
	public Avante(int distance) {
		super(CarName.AVANTE.getName(), distance, KmPerLiter.AVANTE.getKmPerLiter());
	}
}
