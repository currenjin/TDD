package car.model;

import car.Car;
import car.attribute.CarName;
import car.attribute.KmPerLiter;

public class Avante extends Car {
	public Avante(int distance) {
		super(CarName.AVANTE.getName(), distance, KmPerLiter.AVANTE.getKmPerLiter());
	}
}
