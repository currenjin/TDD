package domain.rentcompany;

import java.util.ArrayList;
import java.util.List;

import domain.car.Car;

public class RentCompany {
	private final List<Car> cars = new ArrayList<>();

	public static RentCompany create() {
		return new RentCompany();
	}

	public void addCar(Car car) {
		this.cars.add(car);
	}

	public String generateReport() {
		StringBuilder report = new StringBuilder();

		this.cars.forEach(car -> report
			.append(car.getTripDistance())
			.append("\n"));

		return report.toString();
	}
}
