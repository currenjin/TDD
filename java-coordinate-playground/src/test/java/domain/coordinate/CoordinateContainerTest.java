package domain.coordinate;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;

import org.junit.jupiter.api.Test;

class CoordinateContainerTest {
	private final int MAX_SIZE = 2;
	private final double X = 0.0;
	private final double Y = 1.1;
	private final Coordinate coordinate = Coordinates.of(X, Y);

	@Test
	void creation() {
		CoordinateContainer coordinateContainer = new CoordinateContainer(MAX_SIZE);

		assertThat(coordinateContainer).isInstanceOf(CoordinateContainer.class);
	}

	@Test
	void creationMaxSize() {
		CoordinateContainer coordinateContainer = new CoordinateContainer(MAX_SIZE);

		assertThat(coordinateContainer.getMaxSize()).isEqualTo(MAX_SIZE);
	}

	@Test
	void creationSize() {
		CoordinateContainer coordinateContainer = new CoordinateContainer(MAX_SIZE);

		assertThat(coordinateContainer.getCoordinateSize()).isEqualTo(0);
	}

	@Test
	void addCoordinate() {
		CoordinateContainer coordinateContainer = new CoordinateContainer(MAX_SIZE);
		assertThat(coordinateContainer.getCoordinateSize()).isEqualTo(0);

		coordinateContainer.addCoordinate(coordinate);
		assertThat(coordinateContainer.getCoordinateSize()).isEqualTo(1);

		coordinateContainer.addCoordinate(coordinate);
		assertThat(coordinateContainer.getCoordinateSize()).isEqualTo(2);
	}

	@Test
	void throwExceptionWhenMaximumSizeExceeded() {
		CoordinateContainer coordinateContainer = new CoordinateContainer(MAX_SIZE);

		for (int i = 0; i < MAX_SIZE; i++) { coordinateContainer.addCoordinate(coordinate); }

		assertThatThrownBy(() -> coordinateContainer.addCoordinate(coordinate))
			.hasMessageContaining("Maximum coordinate size exceeded");
	}

	@Test
	void getCoordinates() {
		CoordinateContainer coordinateContainer = new CoordinateContainer(MAX_SIZE);
		coordinateContainer.addCoordinate(coordinate);
		coordinateContainer.addCoordinate(coordinate);

		String actual = coordinateContainer.printCoordinates();

		assertThat(actual).isEqualTo(
				String.format("%s-%s", coordinate.print(), coordinate.print())
		);
	}
}