package domain.car.model;

import domain.car.Car;
import domain.car.attribute.CarName;
import domain.car.attribute.KmPerLiter;

public class K5 extends Car {
	public K5(int distance) {
		super(CarName.K5.getName(), distance, KmPerLiter.K5.getKmPerLiter());
	}
}
