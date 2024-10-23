package domain.coordinate;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import org.junit.jupiter.api.Test;

class CoordinateTest {

	public static final double X = 0.0;
	public static final double Y = 1.0;

	@Test
	void creation() {
		Coordinate coordinate = Coordinates.of(X, Y);

		assertThat(coordinate).isInstanceOf(Coordinate.class);
	}

	@Test
	void get() {
		Coordinate coordinate = Coordinates.of(X, Y);

		assertThat(coordinate.getX()).isEqualTo(X);
		assertThat(coordinate.getY()).isEqualTo(Y);
	}
}