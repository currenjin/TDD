package car.model;

import car.Car;
import car.CarName;
import car.KmPerLiter;

public class K5 extends Car {
	public K5(int distance) {
		super(CarName.K5.getName(), distance, KmPerLiter.K5.getKmPerLiter());
	}
}
