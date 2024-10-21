package domain.car;

public abstract class Car {
	private final String name;
	private final int distance;
	private final int kmPerLiter;

	protected Car(String name, int distance, int kmPerLiter) {
		this.name = name;
		this.distance = distance;
		this.kmPerLiter = kmPerLiter;
	}

	public String getFuelEfficiency() {
		return String.format("%s : %s리터", name, calculateFuelEfficiency());
	}

	private int calculateFuelEfficiency() {
		return distance / kmPerLiter;
	}
}
