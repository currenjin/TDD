package domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CarTest {
    @Test
    @DisplayName("자동차의 이름을 지정할 수 있다")
    void car_name() {
        Car actual = new Car("first");

        assertEquals("first", actual.getName());
    }
}