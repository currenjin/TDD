package car.model;

import car.Car;
import car.attribute.CarName;
import car.attribute.KmPerLiter;

public class K5 extends Car {
	public K5(int distance) {
		super(CarName.K5.getName(), distance, KmPerLiter.K5.getKmPerLiter());
	}
}
