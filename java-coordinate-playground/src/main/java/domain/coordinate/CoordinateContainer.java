package domain.coordinate;

import java.util.ArrayList;
import java.util.List;

public class CoordinateContainer {
	private final List<Coordinate> coordinates = new ArrayList<>();
	private final int maxSize;

	public CoordinateContainer(int maxSize) {
		this.maxSize = maxSize;
	}

	public void addCoordinate(Coordinate coordinate) {
		if (getCoordinateSize() >= this.maxSize) {
			throw new IllegalStateException("Maximum coordinate size exceeded");
		}

		this.coordinates.add(coordinate);
	}

	public int getCoordinateSize() {
		return this.coordinates.size();
	}

	public int getMaxSize() {
		return this.maxSize;
	}
}
