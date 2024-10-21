package domain.car.model;

import domain.car.Car;
import domain.car.attribute.CarName;
import domain.car.attribute.KmPerLiter;

public class Avante extends Car {
	public Avante(int distance) {
		super(CarName.AVANTE.getName(), distance, KmPerLiter.AVANTE.getKmPerLiter());
	}
}
