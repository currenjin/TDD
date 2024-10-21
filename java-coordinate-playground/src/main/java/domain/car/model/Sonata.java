package domain.car.model;

import domain.car.Car;
import domain.car.attribute.CarName;
import domain.car.attribute.KmPerLiter;

public class Sonata extends Car {
	public Sonata(int distance) {
		super(CarName.SONATA.getName(), distance, KmPerLiter.SONATA.getKmPerLiter());
	}
}
