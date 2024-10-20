package car.model;

import car.Car;
import car.attribute.CarName;
import car.attribute.KmPerLiter;

public class Sonata extends Car {
	public Sonata(int distance) {
		super(CarName.SONATA.getName(), distance, KmPerLiter.SONATA.getKmPerLiter());
	}
}
